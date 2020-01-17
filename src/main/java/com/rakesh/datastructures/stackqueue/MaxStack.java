package com.rakesh.datastructures.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**Elements of Programming Interview Pg 121
 * Created by rakesh at Apr 4, 2018 8:58:31 PM
 */
public class MaxStack {

	private static class MaxWithCount{
		Integer max;
		Integer count;
		
		public MaxWithCount(Integer max,Integer count ){
			this.max = max;
			this.count = count;
		}
	}
	
	private Deque<Integer> element = new LinkedList<>();
	private Deque<MaxWithCount> cache = new LinkedList<>();
	
	public boolean empty(){ return element.isEmpty(); }
	
	public void push(Integer x){
		element.addFirst(x);
		if(!cache.isEmpty()){
			if(Integer.compare(x, cache.peekFirst().max) == 0){
				cache.peekFirst().count = cache.peekFirst().count + 1;
			}else if(Integer.compare(x, cache.peekFirst().max) > 1){
				cache.addFirst(new MaxWithCount(x,1));
			}
		}else{
			cache.addFirst(new MaxWithCount(x,1));
		}
	}
	
	public Integer pop(){
		if(empty())
			throw new IllegalStateException("pop(): empty stack");
		
		Integer e = element.removeFirst();
		if(e.equals(cache.peekFirst().max)){
			cache.peekFirst().count--;
			if(cache.peekFirst().count == 0){
				cache.removeFirst();
			}
		}
		return e;
	}
	
	public Integer max(){
		if(empty())
			throw new IllegalStateException("pop(): empty stack");
		
		return cache.peekFirst().max;
	}
}
