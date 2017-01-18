package com.rakesh.algorithms.dynamic;

/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
How many possible unique paths are there?
 */
public class UniquePaths {

	public static void main(String[] a) {
		
		System.out.println(uniquePaths(3, 3));

	}

	public static int uniquePaths(int m, int n) {
		int[] res = new int[n];
		res[0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				System.out.println(res[j]);
				res[j] = res[j] + res[j - 1];
				
			}
		}
		return res[n - 1];
	}

}
