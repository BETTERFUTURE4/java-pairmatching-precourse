package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

import pairmatching.utils.Util;

public class Pairs {
	private final List<Pair> pairList = new ArrayList<>();
	public List<String> nameList;

	public Pairs(List<String> nameList) {
		this.nameList = nameList;
		setPairs();
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Pair pair : pairList) {
			result.append(pair).append("\n");
		}
		return result.toString();
	}

	public void setPairs() {
		nameList = Util.shuffle(nameList);

		for (int i = 0; i < nameList.size() - 1; i += 2) {
			pairList.add(new Pair(nameList.get(i), nameList.get(i + 1)));
		}
		setIfOddPairs();
	}

	private void setIfOddPairs() {
		if (nameList.size() % 2 == 1) {
			pairList.get(pairList.size() - 1)
				.setThreePair(nameList.get(nameList.size() - 1));
		}
	}

	public boolean isInSamePair(Pairs pairsIn) {
		for (Pair pair : pairsIn.pairList) {
			if (!this.pairList.isEmpty() && this.pairList.contains(pair)) {
				return true;
			}
		}
		return false;
	}
}
