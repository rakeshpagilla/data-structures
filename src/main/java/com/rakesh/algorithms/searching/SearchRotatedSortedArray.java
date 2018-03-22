package com.rakesh.algorithms.searching;

/**
 * Created by rakesh at Feb 7, 2018 4:01:46 PM Input arr[] = {3, 4, 5, 1, 2}
 * Element to Search = 1 1) Find out pivot point and divide the array in two
 * sub-arrays. (pivot = 2) Index of 5* 2) Now call binary search for one of the
 * two sub-arrays. (a) If element is greater than 0th element then search in
 * left array (b) Else Search in right array (1 will go in else as 1 < 0th
 * element(3)) 3) If element is found in selected sub-array then return index
 * Else return -1.
 */

public class SearchRotatedSortedArray {

	public int searchRotatedArray(int[] a, int target) {

		int left = 0, right = a.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (a[mid] == target)
				return mid;

			if (a[mid] >= a[left]) {
				if (a[left] <= target && target < a[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (a[mid] <= target && target <= a[right]) {
					left = mid + 1;
				} else {
					right = mid - 1; // Eg: 4 0 1 2 3

				}
			}
		}
		return -1;
	}

}
