package com.rakesh.datastructures.common;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] a){
		
		int[] arr = new int[5];
		
		findIndex( 10, arr);
	}

	public static int[] findIndex( int n , int[] arr){
		
		int[] result = new int[2]; 
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0 ; i< arr.length ; i++){
			
			if(map.containsKey(arr[i])){
				result[0] = map.get(arr[i]) + 1 ; 
				result[1] = i+1;
				return result;
			}
			map.put(n - arr[i], i);
		}
		
		
		return result;
	}
}
