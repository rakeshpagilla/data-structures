package com.rakesh.datastructures.string;
/**
 * Created by rakesh at Mar 21, 2017 8:36:53 PM
 * Check if two strings are permutations of each other.
 */
public class PermutationString {
	
	public static void main(String[] args){
		System.out.println(checkPermutation("HOWARD","RDOWAH"));
	}
	
	
	private static boolean checkPermutation(String s, String t){
		
		if(s.length() != t.length())
			return false;
		
		int[] countArray = new int[128];
		
		for(char c1 : s.toCharArray()){
			countArray[c1]++;
		}
		
		for(char c2 : t.toCharArray()){
			countArray[c2]--;
			if(countArray[c2] < 0){
				return false;
			}
		}
		
		return true;
	}

}
