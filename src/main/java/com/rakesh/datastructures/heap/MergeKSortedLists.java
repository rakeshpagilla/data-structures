package com.rakesh.datastructures.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	
	class ListNode{
		int val; 
		ListNode next;
	}
	
	
	ListNode mergeKListNodes(ArrayList<ListNode> lists){
		
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		
		for(ListNode node : lists)
			q.add(node);
		
		ListNode head = new ListNode();
		ListNode p = head;
		
		while(!q.isEmpty()){
			ListNode temp = q.poll();
			p.next = temp;
			
			if(temp.next != null){
				q.offer(temp.next);
			}
			p = p.next;
		}
		
		return head.next;
		
	}
	

}
