package com.rakesh.datastructures.stackqueue;
/**
 * 1/13/2017
 * @author rpagilla
 * 
 * Video link https://youtu.be/ZmnqCZp9bBs
 * 
 * Given an array representing height of bar in bar graph, find max histogram
 * area in the bar graph. Max histogram will be max rectangular area in the
 * graph.
 * 
 * Maintain a stack
 * 
 * If stack is empty or value at index of stack is less than or equal to value at current 
 * index, push this into stack.
 * Otherwise keep removing values from stack till value at index at top of stack is 
 * less than value at current index.
 * While removing value from stack calculate area
 * if stack is empty 
 * it means that till this point value just removed has to be smallest element
 * so area = input[top] * i
 * if stack is not empty then this value at index top is less than or equal to 
 * everything from stack top + 1 till i. So area will
 * area = input[top] * (i - stack.peek() - 1);
 * Finally maxArea is area if area is greater than maxArea.
 * 
 * 
 * Time complexity is O(n)
 * Space complexity is O(n)
 * 
 * References:
 * http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
 */
import java.util.Stack;

public class LargestRectangleHistogram {

	public static void main(String[] args) {
		LargestRectangleHistogram mh = new LargestRectangleHistogram();
		int input[] = { 2, 2, 2, 6, 1, 5, 4, 2, 2, 2, 2 };
		int maxArea = mh.findMaxArea(input);
		System.out.println(maxArea);
		assert maxArea == 12;
	}

	private static int findMaxArea(int[] a) {

		if (a.length == 0)
			return 0;

		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = 0, area = 0;
		int i = 0;
		for (i = 0; i < a.length;) {

			if (stack.isEmpty() || a[stack.peek()] <= a[i])
				stack.add(i++);
			else {
				int top = stack.pop();

				// if stack is empty means everything till i has to be
				// greater or equal to input[top] so get area by
				// input[top] * i;
				if (stack.isEmpty())
					area = a[top] * i;
				// if stack is not empty then everything from i-1 to
				// input.peek() + 1
				// has to be greater or equal to input[top]
				// so area = input[top]*(i - stack.peek() - 1);
				else {
					area = a[top] * (i - stack.peek() - 1);
				}
				if (area > maxArea)
					maxArea = area;
			}
		}
		// System.out.println(maxArea);

		while (!stack.isEmpty()) {
			int top = stack.pop();
			// if stack is empty means everything till i has to be
			// greater or equal to input[top] so get area by
			// input[top] * i;
			if (stack.isEmpty()) {
				area = a[top] * i;
				// if stack is not empty then everything from i-1 to
				// input.peek() + 1
				// has to be greater or equal to input[top]
				// so area = input[top]*(i - stack.peek() - 1);
			} else {
				area = a[top] * (i - stack.peek() - 1);
			}

			if (area > maxArea)
				maxArea = area;
		}

		return maxArea;
	}
}
