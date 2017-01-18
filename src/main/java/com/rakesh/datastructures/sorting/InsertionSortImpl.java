package com.rakesh.datastructures.sorting;

public class InsertionSortImpl {

	public static void main(String[] a) {

		int[] l = { 4, 6, 9, 10, 3, 1 };

		sortArray(l);

		for (int m : l) {
			System.out.println(m);
		}
	}

	private static int[] sortArray(int[] l) {

		for (int i = 1; i < l.length; i++) {

			int key = l[i];
			int j = i - 1;

			while (j >= 0 && key < l[j]) {
				l[j + 1] = l[j];
				j--;
			}
			l[j + 1] = key;
		}

		return l;
	}

}
