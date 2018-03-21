package com.rakesh.datastructures.common;

public class PalindromeInteger {

	public static void main(String[] a){
		System.out.println(checkPalindrome(3445443));
	}
	public static boolean checkPalindrome(int num) {

		int rev = 0, n = num;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		if (num == rev) {
			return true;
		} else {
			return false;
		}
	}
}
