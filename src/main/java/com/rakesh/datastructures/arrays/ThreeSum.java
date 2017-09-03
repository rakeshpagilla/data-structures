package com.rakesh.datastructures.arrays;

import java.util.*;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.
 Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a  b  c)
 The solution set must not contain duplicate triplets.
 */
public class ThreeSum {
	
	public static void main(String[] args){
		
	}

	public static List<List<Integer>> threeSum(int[] a){

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if(a == null || a.length <3)
			return result;

		Arrays.sort(a);

		
		return result;
	}
}
