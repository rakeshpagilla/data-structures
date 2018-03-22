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
		List<List<Integer>> result = ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
		for(List<Integer> val1 : result){
			for(Integer v : val1){
				System.out.print(v);
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> threeSum(int[] a){

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if(a == null || a.length <3)
			return result;

		Arrays.sort(a);
		for(int i =0 ; i < a.length -2 ; i++){
			System.out.println(i);
			if(i > 0 && a[i] == a[i-1])
				continue;
			
			int j = i+1	;
			int k = a.length - 1;
			
			while(j < k){
				int sum = a[i] + a[j] + a[k];
				if(sum == 0){
					List<Integer> data = new ArrayList<Integer>();
					data.add(a[i]);
					data.add(a[j]);
					data.add(a[k]);
					result.add(data);
					j++;
					k--;
					
					while( j < k && a[j] == a[j-1])
						j++;
					while(j < k && a[k] == a[k+1])
						k--;
				}else if(sum > 0)
					k--;
				else
					j++;
			}
		}

		return result;
	}
}
