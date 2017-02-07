/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *
 *         Created at 10:51:27 AM
 *         http://www.programcreek.com/2013/02/leetcode-maximum-subarray-java/
 *         Find the contiguous subarray within an array (containing at least one
 *         number) which has the largest sum. For example, given the array
 *         [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray [4,−1,2,1] has the
 *         largest sum = 6.
 */
public class MaximumSubArray {

	public static void main(String[] a) {
		Integer[] data = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(returnMaxSum(data));
	}

	private static Integer returnMaxSum(Integer[] a) {

		Integer max = a[0];
		Integer newSum = a[0];

		for (int i = 1; i < a.length; i++) {
			newSum = Math.max(newSum + a[i], a[i]);
			max = Math.max(newSum, max);
			System.out.println(" i " + i + " newSum " + newSum + " max " + max + " a[i] " + a[i]);
		}
		return max;
	}
}
