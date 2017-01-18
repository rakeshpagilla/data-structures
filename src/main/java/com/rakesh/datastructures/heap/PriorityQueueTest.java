package com.rakesh.datastructures.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	static class PQSort implements Comparator<Integer>{
		
		
		public  int compare(Integer i1, Integer i2){
			return i2-i1;
		}
	}
	
	public static void main(String[] a){
		
		
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		int[] l = {4,7,2,6,0,5};
		
		for(int v: l){
			q1.offer(v);
		}
		
		System.out.println(q1);
		
		
		PriorityQueue<Integer> q2 = new PriorityQueue<Integer>(10, new PQSort());
		
		//PriorityQueue<Integer> q3 = new PriorityQueue<Integer>(10,Collections.reverseOrder());
		
		for(int v: l)
			q2.offer(v);
		
		System.out.println(q2);
		
	}

}
