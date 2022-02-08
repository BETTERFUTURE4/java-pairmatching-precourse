package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pair {
	private final List<String> pair = new ArrayList<>();

	public Pair(String pairOne, String pairTwo) {
		this.pair.add(pairOne);
		this.pair.add(pairTwo);
	}

	public void setThreePair(String name) {
		pair.add(name);
	}

	@Override
	public boolean equals(Object obj) {
		// 모델값 같은지 확인
		return this == obj || (obj instanceof Pair && this.hashCode() == obj.hashCode());
	}

	@Override
	public String toString() {
		// 프린트 원하는 방식으로 구현
		StringBuilder string = new StringBuilder();
		for (String s : pair) {
			string.append(s).append(" : ");
		}
		return string.substring(0,string.length()-3);
	}

	@Override
	public int hashCode() {
		// 같은 객체인지 판별하는 기준
		return Objects.hashCode(this.toString());
	}
}
