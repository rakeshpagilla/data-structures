package com.rakesh.datastructures.linkedlist;
/**
 * Created by rakesh at Mar 21, 2018 9:11:53 PM
 * Given a singly linked list, group all odd nodes together followed by the even
nodes. Please note here we are talking about the node number and not the value
in the nodes.
You should try to do it in place. The program should run in O(1) space complexity
and O(nodes) time complexity.
Example: Given 1->2->3->4->5->NULL, return 1->3->5->2->4->NULL.
https://www.programcreek.com/2015/03/leetcode-odd-even-linked-list-java/
 */
public class OddEvenLinkedList {

	
	public ListNode<Integer> oddEvenMerge(ListNode<Integer> head){
		
		ListNode<Integer> result = head;
		ListNode<Integer>  p1 = head;
		ListNode<Integer> p2 = head.next;
		ListNode<Integer> connectNode = head.next;
		
		while(p1 != null && p2 != null){
			
			ListNode<Integer> t = p2.next;
			if(t == null)// Need to check since line 31 could be null
				break;
			
			p1.next = p2.next;
			p1 = p1.next;
			
			p2.next = p1.next;
			p2 = p2.next;
		}
		
		p1.next = connectNode;
		
		return result;
	}
	
	public ListNode<Integer> evenOddMerge(ListNode<Integer> head){
		
		ListNode<Integer> result = head.next;
		ListNode<Integer>  p1 = head;
		ListNode<Integer> p2 = head.next;
		
		while(p1 != null && p2 != null){
			
			ListNode<Integer> t = p2.next;
			if(t == null)
				break;
			
			p1.next = p2.next;
			p1 = p1.next;
			
			p2.next = p1.next;
			p2 = p2.next;
		}
		p1.next = null;
		p2.next = head;
		
		return result;
	}
	
}
