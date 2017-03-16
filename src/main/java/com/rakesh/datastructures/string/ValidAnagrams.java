/**
 * 
 */
package com.rakesh.datastructures.string;

import java.util.HashMap;

/**
 * @author RPagilla
 *
 *         Created at 8:17:26 PM Anagrams: a word, phrase, or name formed by
 *         rearranging the letters of another, such as cinema, formed from
 *         iceman. Given two strings s and t, write a function to determine if t
 *         is an anagram of s.
 *
 */
public class ValidAnagrams {

	public static void main(String[] args) {

		System.out.println(isValidAnagram("AWAAT", "TWAAA"));
	}

	public static boolean isValidAnagram(String s, String t) {

		if(s.length()!=t.length())
		      return false;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (map.containsKey(c)) {
				if (map.get(c) > 1) {
					map.put(c, map.get(c) - 1);
				} else {
					map.remove(c);
				}
			} else {
				return false;
			}
		}
		return map.size() == 0;
	}

}
