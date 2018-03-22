package com.rakesh.datastructures.common;

import java.util.HashMap;

public class TwoSum {
	
	class TwoSumClass{
		
		private HashMap<Integer, Integer> ds = new HashMap<>();
		
		public void add(int num){
			
			if(ds.containsKey(num)){
				ds.put(num, ds.get(num)+1);
			}
			else{
				ds.put(num, 1);
			}
		}
		
		public boolean find(int sum){
			
			for(Integer key : ds.keySet()){
				int target = sum - key;
				if(ds.containsKey(target)){
					//Consider i/p 3,6 and sum to be found is 6. This next line will
					//handle it.
					if(key == target && ds.get(key) < 2)
						continue;
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] a) {
		
		TwoSumClass ts = new TwoSum().new TwoSumClass();
		ts.add(3);
		ts.add(12);
		ts.add(10);
		ts.add(4);
		
		System.out.println(ts.find(11));

		int[] arr = { 2, 4, 5, 8, 10, 19, 22, 38, 100, 101 };

		int[] d = findIndex(10, arr);

		//int[] d = findIndexInSortedArray(201, arr);
		for (int v : d) {
			System.out.println(v);
		}
	}

	private static int[] findIndexInSortedArray(int val, int[] arr) {

		int i = 0, j = arr.length - 1;

		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum > val) {
				j--;
			} else if (sum < val) {
				i++;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		return null;
	}

	public static int[] findIndex(int n, int[] arr) {

		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				result[0] = map.get(arr[i])+1;
				result[1] = i+1;
				return result;
			}else{
				map.put(n-arr[i], i);
			}
		}
		return result;
	}
}
