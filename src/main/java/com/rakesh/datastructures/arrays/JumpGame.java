package com.rakesh.datastructures.arrays;

/**
 * Created by rakesh at Mar 9, 2018 10:51:17 PM Given an array of non-negative
 * integers, you are initially positioned at the first index of the array. Each
 * element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index. For example: A =
 * [2,3,1,1,4], return true. A = [3,2,1,0,4], return false.
 * [2,5,0,0] = O/P true
 */
public class JumpGame {
	
	public static void main(String[] args){
		
		JumpGame j = new JumpGame();
		int[] A  = {2,3,1,1,4};
		int[] B = {3,2,1,0,4};
		System.out.println(j.canJump(A));
		System.out.println(j.canJump(B));
	}

	public boolean canJump(int[] a) {
		
		return true;

	}

}
