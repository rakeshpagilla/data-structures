package com.rakesh.datastructures.common;
/*
 * Leetcode problem.
 * Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
Have you thought about this? Here are some good questions to ask before
coding. Bonus points for you if you have already thought through this!
If the integer's last digit is 0, what should the output be? ie, cases such as 10,
100.
Did you notice that the reversed integer might overflow? Assume the input is a 32-
bit integer, then the reverse of 1000000003 overflows. How should you handle
such cases?
For the purpose of this problem, assume that your function returns 0 when the
reversed integer overflows.
to protect your code from overflow, when met multiply operation, use divide
operation to check first.
 */

public class ReverseInteger {
	
	private Integer reverseNum(Integer num) {
		
		Integer reverse =0;
		boolean nFlag = false;
		if(num <0)
			 nFlag = true;
		
		num = Math.abs(num);
		
		while(num > 0) {
			//To handle overflow value.
			if(reverse > Integer.MAX_VALUE / 10)
				return 0;
			
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		if(nFlag)
			reverse = - reverse;
		
		return reverse;
	}
	
	public static void main(String[] a) {
		System.out.println(new ReverseInteger().reverseNum(1000000003));
		System.out.println(new ReverseInteger().reverseNum(123));
		System.out.println(new ReverseInteger().reverseNum(-420));
	}

}
