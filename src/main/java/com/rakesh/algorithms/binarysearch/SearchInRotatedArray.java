/**
 * 
 */
package com.rakesh.algorithms.binarysearch;

/**
 * @author RPagilla
 *
 *         Created at 6:48:51 PM Suppose a sorted array is rotated at some pivot
 *         unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7
 *         0 1 2). You are given a target value to search. If found in the array
 *         return its index, other- wise return -1. You may assume no duplicate
 *         exists in the array.
 */
public class SearchInRotatedArray {
	public static void main(String[] args) {

		int[] data1 = { 4, 5, 6, 7, 1, 2, 3 };// find 1 or 6
		int[] data2 = { 5, 1, 2, 3, 4 };// find 1
		int[] data3 = { 8, 9, 1, 2, 3, 4, 5 };// Find 8
		System.out.println(findIndex(data1, 1));
		System.out.println(findIndex(data2, 1));
		System.out.println(findIndex(data3, 8));
		
	}

	/**
	 * @param data
	 * @return
	 */
	private static int findIndex(int[] data, int target) {

		int left = 0, right = data.length - 1;

		if (data[left] < data[right]) {
			return -1;
		}

		while (left <= right) {
			int mid = (right + left) / 2;

			if (target == data[mid])
				return mid;

			if (data[left] <= data[mid]) {
				if (target >= data[left] &&  target < data[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (data[mid] < target && target <= data[right]) {
					left = mid + 1;
					
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
}
