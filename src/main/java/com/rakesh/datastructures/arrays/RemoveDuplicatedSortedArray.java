package com.rakesh.datastructures.arrays;

import java.util.Arrays;

/**
 * Created by rakesh at Feb 7, 2018 10:16:16 AM
 */
public class RemoveDuplicatedSortedArray {
	// Function to remove duplicate elements
	// This function returns new size of modified
	// array.
	static int removeDuplicates(int nums[], int n) {
		if (n == 0 || n == 1)
			return n;

		// To store index of next unique element

		int l = 0;
		for (int r = 1; r < nums.length; r++) {
			
			if (nums[r] != nums[l])
				nums[++l] = nums[r];
		}
		return l + 1;
	}
	static int[] simpleRemoveDuplicates(int nums[], int n) {
		
		if(nums.length < 2)
			return nums;
		
		int i=0, j=1;
		
		while(j < nums.length){
			if(nums[i] == nums[j]){
				j++;
			}else{
				i++;
				nums[i] = nums[j];
				j++;
			}
		}
		System.out.println(i + " " + j);
		int[] B = Arrays.copyOf(nums, i);
		return B;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 3, 4};
		int n = arr.length;

		n = removeDuplicates(arr, n);
		
		int[] R = simpleRemoveDuplicates(arr, n);
		for(Integer i : R)
			System.out.print(i + " ");

	}
}
