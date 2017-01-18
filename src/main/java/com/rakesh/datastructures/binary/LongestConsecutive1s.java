package com.rakesh.datastructures.binary;

import java.util.Random;

/*Given a number n, find length of the longest consecutive 1s in its binary representation.
Input : n = 14
Output : 3
The binary representation of 14 is 1110.

Input : n = 222
Output : 4
The binary representation of 222 is 11011110.
*/
public class LongestConsecutive1s {

	public static void main(String[] a){
		
		int val = 6;
	//	findLongest(val);
		Random rd = new Random();
		
		for(int i =0 ; i < val ; i++){
			System.out.println(rd.nextInt(val));
		}
	}

	private static void findLongest(int x) {

		int count = 0;
		
		while( x != 0){
			
			x = (x & (x << 1));
			count ++;
			
		}
		
		System.out.println(count);
	}

}
