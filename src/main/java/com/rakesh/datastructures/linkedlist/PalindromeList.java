package com.rakesh.datastructures.linkedlist;
/**
 * Created by rakesh at Mar 23, 2018 2:57:38 PM
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
public class PalindromeList {
	
    public boolean isPalindrome(ListNode<Integer> head) {
        ListNode<Integer> slow =head, fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode<Integer> first = head;
        ListNode<Integer> second = reverseList(slow);
        
        while(first != null && second != null){
            if(first.data != second.data)
                return false;
            
            first = first.next;
            second= second.next;
        }
        return true;
    }
    
    
    ListNode<Integer> reverseList(ListNode<Integer> head){
        
        ListNode<Integer> previous= null, next = null, current = head;
        
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

}
