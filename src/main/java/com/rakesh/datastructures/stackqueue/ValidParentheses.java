package com.rakesh.datastructures.stackqueue;
/*
 * Given a string containing just the characters ’(’, ’)’, ’’, ’’, ’[’ and ’]’, determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]" are all valid but "(]" and "([)]" are not.
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] a) {

		System.out.println(isValidParentheses("{{()}}"));
	}

	private static Boolean isValidParentheses(String str) {

		if (str == null || str.length() < 1)
			return true;

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (map.containsKey(c)) {
				stack.push(c);
			} else if (map.containsValue(c)) {
				if (stack.empty() || map.get(stack.peek()) != c) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.empty();
	}
}
