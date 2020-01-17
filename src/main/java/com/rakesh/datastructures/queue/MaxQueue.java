package com.rakesh.datastructures.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**Pg 133. Elements of prog. interview.
 * Created by rakesh at Apr 6, 2018 11:19:49 PM
 */
public class MaxQueue<T extends Comparable<T>>{
	
	Deque<T> entries = new LinkedList<>();
	Deque<T> maxEntries = new LinkedList<>();
	
	public void enqueue(T x){
		entries.addLast(x);
		
		while(!maxEntries.isEmpty()){
			if(maxEntries.getLast().compareTo(x) >=0)
				break;
			maxEntries.removeLast();
		}
		maxEntries.addLast(x);
	}
	
	public T dequeue(){
		if(!entries.isEmpty()){
		T toReturn = entries.removeFirst();
		
		if(toReturn.equals(maxEntries.getFirst()))
			maxEntries.removeFirst();
		
		return toReturn;
		}
		throw new NoSuchElementException("Called Dequeue on empty queue");
	}

	public T max(){
		if(!maxEntries.isEmpty())
			return maxEntries.getFirst();
		throw new NoSuchElementException("Empty queue");
	}
}
