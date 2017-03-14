/**
 * 
 */
package com.rakesh.algorithms.binarysearch;

/**
 * @author RPagilla
 *
 *         Created at 10:28:09 AM
 *
 *         Given a sorted array of integers, find the starting and ending
 *         position of a given target value. Your algorithm's runtime complexity
 *         must be in the order of O(log n). If the target is not found in the
 *         array, return [-1, -1]. For example, given [5, 7, 7, 8, 8, 10] and
 *         target value 8, return [3, 4].
 http://www.learn4master.com/algorithms/binary-search/leetcode-search-for-a-range-java
 */
public class SearchRange {

	public static void main(String[] args) {

		int[] data= {5,7,7,8,8,10};
		System.out.println(upperOrLower(data,8,false));
		System.out.println(upperOrLower(data,8,true));
	}

	public static int upperOrLower(int[] nums, int target, boolean upper){

		int left = 0, right = nums.length-1;

		int res = -1;

		while(left <= right){
			int mid = (left+right)/2;
			if(nums[mid] == target){
				res = mid;
				if(upper){
					left = mid+1;
				}else{
					right = mid-1;
				}
			}else if(nums[mid] > target){
				right = mid-1;
			}else{
				left = mid +1;
			}
		}
		return res;
	}

}
