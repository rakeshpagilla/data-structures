package com.rakesh.algorithms.searching;

import java.util.Arrays;

/**
 * Created by rakesh at Feb 9, 2018 11:56:47 AM
 * https://leetcode.com/problems/search-for-a-range/description/
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
public class SearchRange {
	
	public static void main(String[] a){
		int[] d1 = {5, 7, 7, 8, 8, 10};
		int[] d2 = {5, 7, 8, 8, 9, 10};
		int[] d3 = {5, 6, 6, 7, 8, 8};
		int[] d4 = {1,3};
		int[] d5 = {1,4};
		SearchRange sr = new SearchRange();
	//	System.out.println(Arrays.toString(sr.searchRange(d1, 8)));
	//	System.out.println(Arrays.toString(sr.searchRange(d2, 8)));
	//	System.out.println(Arrays.toString(sr.searchRange(d3, 8)));
		//System.out.println(Arrays.toString(sr.searchRange(d4, 1)));
		System.out.println(Arrays.toString(sr.searchRange(d5, 4)));
	}

	public int[] searchRange(int[] nums, int target) {

        if(nums.length == 1){
            if(nums[0] == target){
                return new int[]{0,0};
            }
        }
        
		int[] res = new int[] { -1, -1 };
		if (nums == null || nums.length < 2)
			return res;

		if (nums[0] > target || nums[nums.length - 1] < target)
			return res;

		int l = 0, r = nums.length - 1;

		while (l < r) {
			System.out.println("L " + l + " R " + r);
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				if (nums[mid + 1] == target) {
					res[0] = mid;
					res[1] = mid + 1;
				} else if((mid -1) > 0 && nums[mid-1] == target) {
					res[0] = mid - 1;
					res[1] = mid;
				}else{
					res[0] = mid;
					res[1] = mid;
				}
				return res;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return res;
	}

}
