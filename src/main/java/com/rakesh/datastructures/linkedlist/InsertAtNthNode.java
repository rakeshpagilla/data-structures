package com.rakesh.datastructures.linkedlist;
/**
 * Created by rakesh at May 1, 2018 9:36:29 PM
 */
public class InsertAtNthNode {
	
	public static void main(String[] a){
		
		ListNode<Integer> head = new ListNode<Integer>(2);
		head.next = new ListNode<Integer>(5);
		head.next.next = new ListNode<Integer>(3);
		head.next.next.next = new ListNode<Integer>(9);
		head.next.next.next.next = new ListNode<Integer>(12);
		new InsertAtNthNode().insertAt(head, 3, 8);
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	ListNode<Integer> insertAt(ListNode<Integer> head, int position, int data){
		
		ListNode<Integer> node = new ListNode<Integer>(data);
		
		if(position == 0 ){
			if(head == null)
				return node;
			node.next = head;
			return node;
		}
		
		ListNode<Integer> current = head, prev = null;
		int k=0;
		
		while(current != null ){
			if(position == k){
				prev.next = node;
				node.next = current;
				break;
			}
			prev= current;
			current = current.next;
			k++;
		}
		
		return head;
	}

}
