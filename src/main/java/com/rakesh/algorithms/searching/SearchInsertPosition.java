package com.rakesh.algorithms.searching;

public class SearchInsertPosition {

	public static void main(String[] a) {

		int[] am = { 5, 7, 10, 13, 18, 21 };
		System.out.println(searchInsert(am, 19));

	}

	public static int searchInsert(int[] a, int target) {

		if (a == null || a[0] > target)
			return 0;

		int s = 0;
		int e = a.length - 1;

		while (s <= e) {

			int m = (s+e)/2;
			
			System.out.println(s + " ** " + e);
			if (a[m] == target)
				return m;
			else if (a[m] > target)
				e = m - 1;
			else
				s = m + 1;
		}

		return s;
	}

}