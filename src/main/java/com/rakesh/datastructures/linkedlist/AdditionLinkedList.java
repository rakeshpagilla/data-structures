package com.rakesh.datastructures.linkedlist;

/**
 * Created by rakesh at Mar 24, 2018 10:47:39 PM
 */
public class AdditionLinkedList {

	public static ListNode<Integer> addLists(ListNode<Integer> l1,
			ListNode<Integer> l2) {

		ListNode<Integer> res = new ListNode<Integer>();
		ListNode<Integer> i = res;
		int carry = 0;
		while (l1 != null || l2 != null) {

			int sum = carry;

			if (l1 != null) {
				sum = sum + l1.data;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum = sum + l2.data;
				l2 = l2.next;
			}

			i.next = new ListNode<Integer>(sum % 10);
			carry = sum / 10;
			i = i.next;
		} 

		if (carry > 0) {
			i.next = new ListNode<Integer>(carry);
		}
		return res.next;
	}

}
