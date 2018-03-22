package com.rakesh.algorithms.dynamic;

import java.util.Arrays;

/**
 * @author RPagilla
 *
 *         Created at 9:45:53 AM Given an unsorted array of integers, find the
 *         length of longest increasing subsequence.
 * 
 *         For example, given [10, 9, 2, 5, 3, 7, 101, 18], the longest
 *         increasing subsequence is [2, 3, 7, 101]. Therefore the length is 4.
 *         Note that the time complexity of the above Dynamic Programming (DP)
 *         solution is O(n^2) and there is a O(nLogn) solution for the LIS
 *         problem. We have not discussed the O(n Log n) solution here as the
 *         purpose of this post is to explain Dynamic Programming with a simple
 *         example. See below post for O(n Log n) solution.
 *         http://www.geeksforgeeks.org/longest-monotonically-increasing-
 *         subsequence-size-n-log-n/
 *         https://www.youtube.com/watch?v=CE2b_-XfVDk
 *
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		Integer[] data = { 9, 1, 3, 7, 5, 6, 20 };
		findSubDP(data);
	}

	private static void findSubDP(Integer[] a) {
		int[] max = new int[a.length];
		Arrays.fill(max, 1);

		int result = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j]) {
					max[i] = Math.max(max[i], max[j] + 1);
				}
			}
			result = Math.max(max[i], result);
		}
		System.out.println(result);
	}

	
}

