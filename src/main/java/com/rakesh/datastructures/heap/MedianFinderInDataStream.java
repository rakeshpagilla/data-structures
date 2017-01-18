package com.rakesh.datastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinderInDataStream {

	private PriorityQueue<Integer> maxHeap;
	private PriorityQueue<Integer> minHeap;

	public MedianFinderInDataStream() {
		maxHeap = new PriorityQueue<Integer>(11, Collections.reverseOrder());
		minHeap = new PriorityQueue<Integer>();
	}

	public void add(int val) {
		maxHeap.offer(val);
		minHeap.add(maxHeap.poll());

		if (maxHeap.size() < minHeap.size()) {
			maxHeap.add(minHeap.poll());
		}
	}
	
	public Integer findMedian(){
		
		if(maxHeap.size() == minHeap.size()){
			return (maxHeap.peek() + minHeap.peek())/2;
		}
		return maxHeap.peek();
	}

}
