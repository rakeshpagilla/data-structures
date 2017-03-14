/**
 * 
 */
package com.rakesh.algorithms.binarysearch;

/**
 * @author RPagilla
 *
 *         Created at 8:45:02 PM
 *
 *         Suppose a sorted array is rotated at some pivot unknown to you
 *         beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). Find
 *         the minimum element.You may assume no duplicate exists in the array.
 * 
 *         Expl: This problem is a binary search and the key is breaking the
 *         array to two parts, so that we only need to work on half of the array
 *         each time. If we pick the middle element, we can compare the middle
 *         element with the leftmost (or rightmost) element. If the middle
 *         element is less than leftmost, the left half should be selected; if
 *         the middle element is greater than the leftmost (or rightmost), the
 *         right half should be selected. Using recursion or iteration, this
 *         problem can be solved in time log(n). In addition, in any rotated
 *         sorted array, the rightmost element should be less than the left-most
 *         element, otherwise, the sorted array is not rotated and we can simply
 *         pick the leftmost element as the minimum.
 */
public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {

		int[] data = {4,5,6,7,1,2,3};
		System.out.println(minValue(data));
	}

	public static int minValue(int[] data) {

		if (data == null || data.length == 0)
			return -1;

		int left = 0, right = data.length - 1;

		while (left <= right) {

			if (data[left] <= data[right]) {
				return data[left];
			}

			int mid = (left + right) / 2;

			if (data[mid] >= data[left]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return -1;
	}

}
