package com.rakesh.datastructures.common;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] a) {

		int[] arr = { 2, 4, 5, 8, 10, 19, 22, 38, 100, 101 };

		int[] d = findIndex(10, arr);

		//int[] d = findIndexInSortedArray(201, arr);
		for (int v : d) {
			System.out.println(v);
		}
	}

	private static int[] findIndexInSortedArray(int val, int[] arr) {
		// TODO Auto-generated method stub

		int i = 0, j = arr.length - 1;

		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum > val) {
				j--;
			} else if (sum < val) {
				i++;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		return null;
	}

	public static int[] findIndex(int n, int[] arr) {

		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				result[0] = map.get(arr[i])+1;
				result[1] = i+1;
				return result;
			}else{
				map.put(n-arr[i], i);
			}
		}
		return result;
	}
}
