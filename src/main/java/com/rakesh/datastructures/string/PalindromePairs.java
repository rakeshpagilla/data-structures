/**
 * 
 */
package com.rakesh.datastructures.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author RPagilla
 *
 *         Created at 10:29:57 AM Given a list of unique words. Find all pairs
 *         of distinct indices (i, j) in the given list, so that the
 *         concatenation of the two words, i.e. words[i] + words[j] is a
 *         palindrome. Example 1: Given words = ["bat", "tab", "cat"] Return
 *         [[0, 1], [1, 0]] The palindromes are ["battab", "tabbat"] I/P:
 *         {"abcd","dcba","lls","s","sssll"} O/P: [[0,1],[1,0],[3,2],[2,4]]
 * 
 *         http://shirleyisnotageek.blogspot.com/2016/06/palindrome-pairs.html
 *
 */
public class PalindromePairs {
	public static void main(String[] args) {

		String[] data = { "abcd", "dcba", "lls", "s", "sssll" };
		List<List<Integer>> l = palindromPairs(data);
		for (List<Integer> list : l)
			System.out.println(list);
	}

	public static List<List<Integer>> palindromPairs(String[] data) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < data.length; i++) {
			map.put(data[i], i);
		}

		List<List<Integer>> toReturn = new ArrayList<>();

		for (int i = 0; i < data.length; i++) {
			String s = data[i];
			String rev1 = reverse(s);
			if (map.containsKey(rev1) && (map.get(rev1) != i)) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				list.add(map.get(rev1));
				toReturn.add(list);
			}

			for (int j = 0; j < s.length(); j++) {
				String left = s.substring(0, j);
				String right = s.substring(j, s.length());
				String rleft = reverse(left);
				String rright = reverse(right);

				if (isPalindrome(left, "") && map.containsKey(rright)) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(map.get(rright));
					list.add(i);
					toReturn.add(list);
				}

				if (isPalindrome(right, "") && map.containsKey(rleft)) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(i);
					list.add(map.get(rleft));
					toReturn.add(list);
				}
			}

		}
		return toReturn;
	}

	private static boolean isPalindrome(String a, String b) {
		String ab = a + b;
		int start = 0;
		int end = ab.length() - 1;
		while (start < end) {
			if (ab.charAt(start) != ab.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

	public static String reverse(String s) {

		int left = 0, right = s.length() - 1;
		char[] array = s.toCharArray();
		for (; left < right; left++, right--) {
			char temp = array[right];
			array[right] = array[left];
			array[left] = temp;
		}
		return new String(array);
	}
}
