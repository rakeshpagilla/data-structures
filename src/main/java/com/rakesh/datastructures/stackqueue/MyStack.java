/**
 * 
 */
package com.rakesh.datastructures.stackqueue;

/**
 * @author RPagilla
 *
 *         Created at 8:17:42 AM
 * @param <T>
 *
 */
public class MyStack<T> {

	private static class StackNode<T> {

		T data;

		StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}
	}

	StackNode<T> top;
	
	public T pop() throws Exception{
		if(top == null)
			throw new Exception();
		T toReturn = top.data;
		top = top.next;
		return toReturn;
	}

	public void push(T item){
		StackNode<T> node = new StackNode<T>(item);
		node.next = top;
		top = node;
	}

	public T peek() throws Exception{
		if(top == null)
			throw new Exception();
		return top.data;
	}

	public boolean isEmpty(){
		return top == null;
	}
}
