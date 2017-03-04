/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *
 *         Created at 9:31:16 AM
 * 
 *         Ref: https://www.youtube.com/watch?v=Fi5INvcmDos
 * 
 *         http://www.programcreek.com/2013/12/leetcode-solution-of-longest-
 *         palindromic-substring-java/
 *
 */
public class LongestPalindromeSubstring {
	public static void main(String[] a) {
		String s = new LongestPalindromeSubstring().longestPalindrome("abaabc");

		//System.out.println(s);
	}

	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}

		if (s.length() == 1) {
			return s;
		}

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
			System.out.println(longest);
		}

		return longest;
	}

	// Given a center, either one letter or two letter,
	// Find longest palindrome
	public String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}

}
