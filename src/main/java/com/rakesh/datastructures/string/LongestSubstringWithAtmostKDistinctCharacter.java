/**
 * 
 */
package com.rakesh.datastructures.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RPagilla
 *
 *         Created at 7:47:41 AM Given a string, find the longest substring that
 *         contains only two unique charac- ters. For example, given
 *         "abcbbbbcccbdddadacb", the longest substring that contains 2 unique
 *         character is "bcbbbbcccb".
 *
 */
public class LongestSubstringWithAtmostKDistinctCharacter {

	public static void main(String[] args) {

		System.out.println(returnMax("abcbbbbcccbdddadacb"));
	}

	public static int returnMax(String s) {

		Map<Character, Integer> map = new HashMap<>();

		int start = 0, max = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

			if (map.size() > 2) {
				max = Math.max(max, i - start);
				
				while (map.size() > 2) {
					char t = s.charAt(start);
					Integer count = map.get(t);
					if (count > 1) {
						map.put(t, count - 1);
					} else {
						map.remove(t);
					}
					start++;
				}
			}
		}
		max = Math.max(max, s.length() - start);
		return max;
	}
}
