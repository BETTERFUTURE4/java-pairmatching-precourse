package pairmatching.controller;

import pairmatching.domain.Level;
import pairmatching.domain.Mission;
import pairmatching.domain.Pairs;
import pairmatching.domain.repository.Repository;
import pairmatching.view.OutputView;

public class PairMatchingController {
	public static final String NO = "아니오";

	public PairMatchingController() {
		start();
	}

	private void start() {
		// 작동 시작
		String mainInput = InputController.getMain();
		if (mainInput.equals("Q")) {
			return;
		}
		if (mainInput.equals("1")) {
			pairMatch();
		}
		if (mainInput.equals("2")) {
			pairSearch();
		}
		if (mainInput.equals("3")) {
			pairReset();
		}
		start();
	}

	private void pairMatch() {
		String[] input = InputController.getPairMatchList();
		String end = input[0];
		Mission mission = Repository.levelsFind(input[1]).findMission(input[2]);

		if (!mission.isEmpty(end) && InputController.getRePairMatch().equals(NO)) {
			return;
		}

		for (int matchCount = 0; matchCount < 3; matchCount++) {
			mission.setPairs(end, new Pairs(Repository.getBranchList(end)));
			if (Repository.levelsFind(input[1]).isDuplicatedPair(mission, end)) {
				System.out.println("레벨 내에 중복된 페어가 있습니다. - " + matchCount + "번째 시도");
				mission.reset(end);
				continue;
			}
			OutputView.printPairs(mission.getPairs(end));
			return;
		}
		System.out.println("3회 시도까지 매칭이 안됐습니다.");
	}

	private void pairSearch() {
		String[] input = InputController.getPairMatchList();
		String end = input[0];
		Mission mission = Repository.levelsFind(input[1]).findMission(input[2]);

		OutputView.printPairs(mission.getPairs(end));
	}

	private void pairReset() {
		Repository.levels.forEach(Level::reset);
		OutputView.printReset();
	}

}
