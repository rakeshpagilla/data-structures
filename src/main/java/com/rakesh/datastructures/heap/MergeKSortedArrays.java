package com.rakesh.datastructures.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	
	class ArrayContainer implements Comparable<ArrayContainer>{
		
		int[] arr;
		int index;
		
		ArrayContainer(int[] arr, int index){
			this.arr = arr;
			this.index = index;
		}

		public int compareTo(ArrayContainer o ){
			return this.arr[this.index] - o.arr[o.index];
		}
	}
	
	public int[] mergeKsortedArrays(int[][] arr){
		
		PriorityQueue<ArrayContainer> q = new PriorityQueue<ArrayContainer>();
		int total = 0;
		
		for(int  i =0 ; i < arr.length ; i++){
			q.offer(new ArrayContainer(arr[i],0));
			total = total + arr[i].length;
		}
		
		int[] result = new int[total];
		int m = 0 ;
		while( !q.isEmpty()){
			ArrayContainer val = q.poll();
			result[m++] = val.arr[val.index];
			
			if(val.index < val.arr.length-1){
				q.offer(new ArrayContainer(val.arr, val.index+1));
			}
		}
		
		return result;
	}
	
	public static void main(String[] a){
		int[] arr1 = { 1, 3, 5, 7 };
	    int[] arr2 = { 2, 4, 6, 8 };
	    int[] arr3 = { 0, 9, 10, 11 };
	    
	  //  int[][] res = new int[][]{arr1,arr2,arr3};
	    
	    MergeKSortedArrays m = new MergeKSortedArrays();
	    
	    int[] res = m.mergeKsortedArrays(new int[][]{arr1,arr2,arr3});
	    
	    System.out.println(Arrays.toString(res));
	}

}
