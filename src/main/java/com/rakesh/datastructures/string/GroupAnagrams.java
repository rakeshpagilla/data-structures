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
 *         Created at 2:44:18 PM Leet Code: Medium
 *
 *         Given an array of strings, return all groups of strings that are
 *         anagrams.
 * 
 *         An anagram is a type of word play, the result of rearranging the
 *         letters of a word or phrase to produce a new word or phrase, using
 *         all the original letters exactly once; for example, Torchwood can be
 *         rearranged into Doctor Who.
 * 
 * 
 *         Time complexity: If the average length of verbs is m and array length
 *         is n, then the time is O(n*m).
 */
public class GroupAnagrams {

	public static void main(String[] args) {

		String[] data = { "this", "awa", "waa", "shit", };
		List<List<String>> list = groupAnagrams(data);
		for (List<String> l : list) {
			System.out.println(l);
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (String s : strs) {
			char[] array = new char[26];
			for (int i = 0; i < s.length(); i++) {
				array[s.charAt(i) - 'a']++;
			}
			String code = new String(array);
			System.out.println(code.toString());

			if (map.containsKey(code)) {
				map.get(code).add(s);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(s);
				map.put(code, list);
			}
		}
		result.addAll(map.values());
		return result;
	}
}
