package com.rakesh.datastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * Similar to balancing BST in Method 2 above, we can use a max heap on left side to represent elements 
 * that are less than effective median, and a min heap on right side to represent elements that are greater than effective median.
 * After processing an incoming element, the number of elements in heaps differ utmost by 1 element. 
 * When both heaps contain same number of elements, we pick average of heaps root data as effective median. 
 * When the heaps are not balanced, we select effective median from the root of heap containing more elements.
 */
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

	public Integer findMedian() {

		if (maxHeap.size() == minHeap.size()) {
			return (maxHeap.peek() + minHeap.peek()) / 2;
		}
		return maxHeap.peek();
	}

}
