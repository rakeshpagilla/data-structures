package com.rakesh.datastructures.queue;

import java.util.NoSuchElementException;

/**
 * Created by rakesh at Apr 8, 2018 8:31:22 PM Implement queue using Linked
 * list.
 */
public class MyQueue<T> {

	private static class QueueNode<T> {

		T data;
		QueueNode<T> next;

		public QueueNode(T data) {
			this.data = data;
		}
	}

	QueueNode<T> head, tail;

	public void add(T item) {
		QueueNode<T> t = new QueueNode<T>(item);
		if (tail == null) {
			head = tail = t;
			return;
		}
		tail.next = t;
		tail = t;
	}

	public T remove() {
		if (head == null)
			throw new NoSuchElementException();
		T toReturn = head.data;
		head = head.next;
		if (head == null)
			tail = null;
		return toReturn;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public T peek() {
		if (head == null)
			throw new NoSuchElementException();
		return head.data;
	}

}
