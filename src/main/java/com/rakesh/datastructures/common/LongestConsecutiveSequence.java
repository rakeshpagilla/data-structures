/**
 * 
 */
package com.rakesh.datastructures.common;

import java.util.HashSet;
import java.util.Set;

/**
 * @author RPagilla
 *
 *         Created at 12:59:12 PM Given an unsorted array of integers, find the
 *         length of the longest consecutive elements sequence. For example,
 *         given [100, 4, 200, 1, 3, 2], the longest consecutive elements
 *         sequence should be [1, 2, 3, 4]. Its length is 4. Your algorithm
 *         should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] data = { 100, 2, 200, 1, 3, 4};
		System.out.println(returnMax(data));
	}

	public static int returnMax(int[] num) {

		Set<Integer> set  = new HashSet<>();

		for(int n : num)
			set.add(n);

		int max =1;

		for(int e : num){
			int left = e-1;
			int right = e+1;
			int count =1;

			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}

			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
			max= Math.max(max,count);
		}
		return max;
	}
}
