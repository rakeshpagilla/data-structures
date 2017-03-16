/**
 * 
 */
package com.rakesh.datastructures.stackqueue;

import java.util.Stack;

/**
 * @author RPagilla 
 *
 * Created at 9:19:29 AM
 *
Given a string containing just the characters ’(’ and ’)’, find the length of the longest valid (well-formed) parentheses substring.
For "(()", the longest valid parentheses substring is "()", which has length = 2. An- other example is ")()())", 
where the longest valid parentheses substring is "()()", which has length = 4.
https://leetcode.com/articles/longest-valid-parentheses/#approach-4-without-extra-space-accepted
Input: str = "(()()"

Initialize result as 0 and stack with one item -1.

For i = 0, str[0] = '(', we push 0 in stack

For i = 1, str[1] = '(', we push 1 in stack

For i = 2, str[2] = ')', currently stack has [-1, 0, 1], we pop
from the stack and the stack now is [-1, 0] and length of current
valid substring becomes 2 (we get this 2 by subtracting stack top 
from current index).
Since current length is more than current result, we update result.

For i = 3, str[3] = '(', we push again, stack is [-1, 0, 3].

For i = 4, str[4] = ')', we pop from the stack, stack becomes 
[-1, 0] and length of current valid substring becomes 4 (we get 
this 4 by subtracting stack top from current index). 
Since current length is more than current result, we update result. 
 */
public class LongestValidParantheses {

	public static void main(String[] args){
		System.out.println(returnMaxLen("())((())"));
		System.out.println(returnMaxLen(")("));
	}

	public static int returnMaxLen(String s){

		int max =0;

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);

		for(int i =0 ; i < s.length() ; i++){
			char c = s.charAt(i);

			if(c == '('){
				stack.push(i);
			} else{
				stack.pop();
				if(stack.isEmpty()){
					stack.push(i);
				}else{
					max = Math.max(max, i - stack.peek());
				}
			}
		}
		System.out.println(stack.toString());
		return max;
	}

}
