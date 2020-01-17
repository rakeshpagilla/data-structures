package com.rakesh.datastructures.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rakesh at Apr 8, 2018 8:51:17 AM
 * https://www.geeksforgeeks.org/sliding
 * -window-maximum-maximum-of-all-subarrays-of-size-k/
 * https://www.nayuki.io/page/sliding-window-minimum-maximum-algorithm
 */
public class SlidingWindowMax {
	// Driver program to test above functions
	public static void main(String[] args) {
		int arr1[] = { 12, 1, 78, 90, 57, 89, 56 };
		maxSlidingWindow(arr1, 1);
		System.out.println("**********");
		int arr2[] = { 9, 11 };
		maxSlidingWindow(arr2, 2);
	}

	static int[] maxSlidingWindow(int[] nums, int k) {

		List<Integer> result = new ArrayList<Integer>();

		if (nums.length == 1) {
			return new int[] { nums[0] };
		}

		Deque<Integer> q = new LinkedList<Integer>();
		int i = 0;
		for (; i < k; i++) {
			while (!q.isEmpty() && nums[q.getLast()] < nums[i]) {
				q.removeLast();
			}
			q.addLast(i);
		}

		for (; i < nums.length; i++) {
			result.add(nums[q.getFirst()]);
			//System.out.println(nums[q.getFirst()]);

			if (!q.isEmpty() && i - k == q.getFirst())
				q.removeFirst();

			while (!q.isEmpty() && nums[q.getLast()] < nums[i]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		if (!q.isEmpty()) {
			result.add(nums[q.getFirst()]);
		//	System.out.println(nums[q.getFirst()]);
		}
		int[] array = new int[result.size()];
		for (int z = 0; z < result.size(); z++){
			array[z] = result.get(z);
			System.out.println(array[z]);
		}

		return array;
	}
}
