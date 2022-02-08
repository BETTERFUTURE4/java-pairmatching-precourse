package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Level {
	public final int num;
	public ArrayList<Mission> missions = new ArrayList<>();
	public String[] missionNames;

	public Level(int num, String[] missionNames) {
		this.num = num;
		this.missionNames = missionNames;
		setMissions(missionNames);
	}

	public void setMissions(String[] missions) {
		for (String missionName : missions) {
			this.missions.add(new Mission(missionName));
		}
	}

	public Mission findMission(String name) {
		for (Mission mission : missions) {
			if (mission.missionName.equals(name)) {
				return mission;
			}
		}
		return null;
	}

	public boolean isDuplicatedPair(Mission missionIn, String end) {
		for (Mission mission : missions) {
			if (missionIn == mission || mission.getPairs(end) == null) {
				continue;
			}
			Pairs pairsIn = missionIn.getPairs(end);
			if (mission.getPairs(end).isInSamePair(pairsIn)) {
				return true;
			}
		}
		return false;
	}

	public void reset() {
		for (Mission mission : missions) {
			mission.reset();
		}
	}

	@Override
	public boolean equals(Object obj) {
		// 모델값 같은지 확인
		return this == obj || (obj instanceof Level && this.hashCode() == obj.hashCode());
	}

	@Override
	public String toString() {
		// 프린트 원하는 방식으로 구현
		String answer = "-레벨" + num + ": ";
		List<String> list = new ArrayList<>();
		for (Mission mission : missions) {
			list.add(mission.toString());
		}
		return answer + String.join(" | ", list);
	}

	@Override
	public int hashCode() {
		// 같은 객체인지 판별하는 기준
		return Objects.hashCode(this.toString());
	}
}
