package com.rakesh.datastructures.linkedlist;
/**
 * Created by rakesh at May 1, 2018 9:56:22 PM
 */
public class MergeTwoSortedLists {

	public static void main(String[] a){
		ListNode<Integer> head1 = new ListNode<Integer>(2);
		head1.next = new ListNode<Integer>(5);
		head1.next.next = new ListNode<Integer>(8);
		head1.next.next.next = new ListNode<Integer>(12);
		head1.next.next.next.next = new ListNode<Integer>(16);
		
		ListNode<Integer> head2 = new ListNode<Integer>(3);
		head2.next = new ListNode<Integer>(6);
		head2.next.next = new ListNode<Integer>(7);
		head2.next.next.next = new ListNode<Integer>(10);
		head2.next.next.next.next = new ListNode<Integer>(15);
		ListNode<Integer> head = new MergeTwoSortedLists().mergeLists(head1, head2);
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	ListNode<Integer> mergeLists(ListNode<Integer> head1, ListNode<Integer> head2){
		
		ListNode<Integer> p= head1, q = head2;
		ListNode<Integer> f = new ListNode<Integer>();
		ListNode<Integer> n = f;
		
		while(p != null && q != null){
			if(p.data < q.data){
				n.next = p;
				p = p.next;
			}else{
				n.next = q;
				q=q.next;
			}
			n = n.next;
		}
		
		if(p != null){
			n.next = p;
		}
		
		if(q != null){
			n.next = q;
		}
		return f.next;
	}
}
