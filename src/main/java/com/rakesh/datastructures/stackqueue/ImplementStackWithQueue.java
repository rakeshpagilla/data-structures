package com.rakesh.datastructures.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by rakesh at Apr 7, 2018 10:40:15 AM
 * https://www.geeksforgeeks.org/implement-stack-using-queue/
 * Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
 */
public class ImplementStackWithQueue {
	
	Deque<Integer> q1 = new LinkedList<>();
	Deque<Integer> q2 = new LinkedList<>();
	
	public void push(Integer x){
		q2.addLast(x);
		while(!q1.isEmpty()){
			q2.addLast(q1.removeFirst());
		}
		Deque<Integer> temp;
		temp = q2;
		q2 = q1;
		q1 = temp;
	}

	public Integer pop(){
		return q1.removeFirst();
	}
	
	public Integer top(){
		return q1.getFirst();
	}
}
