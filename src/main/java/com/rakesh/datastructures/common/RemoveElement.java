package com.rakesh.datastructures.common;

/*
 * 
 * Given an array and a value, remove all instances of that value in place and 
 * return the new length. (Note: The order of elements can be changed. 
 * It doesn’t matter what you leave beyond the new length.)
 */
public class RemoveElement {

	public static void main(String[] a) {
		int[] data = { 1, 2, 3, 4, 3, 5 };
		removeElement(data, 3);
	}

	public static int removeElement(int[] data, int ele) {

		int i = 0, j = 0;

		while (j < data.length) {
			if (data[j] != ele) {
				data[i] = data[j];
				i++;
			}
			j++;
		}

		for (int d : data) {
			System.out.println(d);
		}
		return i;
	}
}
