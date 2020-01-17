package com.rakesh.datastructures.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by rakesh at Apr 8, 2018 2:30:15 PM
 * https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/
 * Given an array and a positive integer k, find the first negative integer for
 * each and every window(contiguous subarray) of size k.If a window does not
 * contain a negative integer, then print 0 for that window. Input : arr[] =
 * {-8, 2, 3, -6, 10}, k = 2 Output : -8 0 -6 -6 First negative integer for each
 * window of size k {-8, 2} = -8 {2, 3} = 0 (does not contain a negative
 * integer) {3, -6} = -6 {-6, 10} = -6 Input : arr[] = {12, -1, -7, 8, -15, 30,
 * 16, 28} , k = 3 Output : -1 -1 -7 -15 -15 0
 */
public class FirstNegativeInteger {
	private static void firstNegative(int a[], int k) {
		Deque<Integer> q = new LinkedList<Integer>();
		int i = 0;
		for (; i < k; i++) {
			if (a[i] < 0) {
				q.addLast(i);
			}
		}

		for (; i < a.length; i++) {
			if (!q.isEmpty()) {
				System.out.println(a[q.getFirst()]);
			} else {
				System.out.println(0);
			}

			if (!q.isEmpty() && q.getFirst() == i - k)
				q.removeFirst();

			if (a[i] < 0)
				q.addLast(i);
		}

		if (!q.isEmpty()) {
			System.out.println(a[q.getFirst()]);
		} else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		int arr2[] = { -8, 2, 3, -6, 10};
		firstNegative(arr2, 2);
	}
}
