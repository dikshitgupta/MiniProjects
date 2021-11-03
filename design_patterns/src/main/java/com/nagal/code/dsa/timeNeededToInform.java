package com.nagal.code.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class timeNeededToInform {

	// manager[i] manager of ith employee// manager[head]= -1
	// head of company want to inform all
	// inform[i] time needed for i to spead to all.

	int answer = 0;

	private void dfs(int head, int[] manager, int[] informTime, HashMap<Integer, ArrayList<Integer>> child, int cost) {
		if (child.containsKey(head) == false) return;
		cost += informTime[head];
		answer = Math.max(answer, cost);

		for (Integer ch : child.get(head)) {
			dfs(ch, manager, informTime, child, cost);
		}
		return;
	}


	public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

		HashMap<Integer, ArrayList<Integer>> child = new HashMap<>();

		// boolean [] visited=new boolean[n];
		// Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (child.containsKey(manager[i])) {
				child.get(manager[i]).add(i);
			} else {
				child.put(manager[i], new ArrayList<Integer>(Arrays.asList(i)));
			}
		}

		dfs(headID, manager, informTime, child, 0);

		return answer;
	}
}