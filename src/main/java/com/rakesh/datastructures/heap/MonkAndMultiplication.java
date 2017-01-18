package com.rakesh.datastructures.heap;

import java.util.PriorityQueue;

/**
 * https://www.hackerearth.com/code-monk-heaps-and-priority-queues/algorithm/
 * monk-and-multiplication/ The Monk learned about priority queues recently and
 * asked his teacher for an interesting problem. So his teacher came up with a
 * simple problem. He now has an integer array A. For each index i, he wants to
 * find the product of the largest, second largest and the third largest integer
 * in the range [1,i]. Note: Two numbers can be the same value-wise but they
 * should be distinct index-wise.
 * 
 * Input: The first line contains an integer N, denoting the number of elements
 * in the array A. The next line contains N space separated integers, each
 * denoting the ith integer of the array A.
 */

public class MonkAndMultiplication {
	public static void main(String args[]) throws Exception {

		// Scanner
		int N = 5;

		int[] a = new int[N + 1];
		String vals = "1 2 3 4 5";
		String[] splits = vals.split("\\s+");

		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(splits[i]);
		}
		
		int first = -1, second = -1, third = -1;

		for (int i = 0; i < N; i++) {

			int curr = a[i];

			if (curr >= first) {
				third = second;
				second = first;
				first = curr;
			} else if (curr >= second) {
				third = second;
				second = curr;
			} else if (curr > third) {
				third = curr;
			}

			if (i < 2) {
				System.out.println(-1);
			} else {
				System.out.println(first * second * third);
			}
		}

	}

}
