package com.rakesh.datastructures.common;

/*
 * Given an array nums, write a function to move all 0’s to the end of it while maintaining the 
 * relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
nums should be [1, 3, 12, 0, 0].
 */

public class MoveZeroes {
	public static void main(String[] a) {

		int[] data = { 1, 24, 0, 6, 0, 7 };
		int[] returned = moveZeroes(data);
		for (int val : returned) {
			System.out.println(val);
		}
	}

	public static int[] moveZeroes(int[] data) {

		int i = 0, j = 0;

		while (j < data.length) {
			if (data[j] != 0) {
				data[i] = data[j];
				i++;
			}
			j++;
		}

		while (i < data.length) {
			data[i] = 0;
			i++;
		}
		return data;
	}
}
