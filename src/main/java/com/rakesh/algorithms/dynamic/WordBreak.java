/**
 * 
 */
package com.rakesh.algorithms.dynamic;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author RPagilla
 *
 *         Created at 3:00:48 PM
 *
 */
public class WordBreak {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("this");
		hs.add("is");
		hs.add("sumit");
		hs.add("jain");
		hs.add("the");
		hs.add("problem");
		String s = "thishglvkjbissumitjain";

		WordBreak ws = new WordBreak();

		// create another HashSet so store the sub problems result
		HashSet<String> memoization = new LinkedHashSet<String>();
		ws.findUsingDP(s, hs, memoization, "",0);
		for(String v :memoization){
			System.out.println(v);
		}
	}

	public boolean findUsingDP(String s, HashSet<String> dict, HashSet<String> memory, String answer, int count) {
		if (s.length() == 0) {
			System.out.println(count + " " +answer);
			return true;
		} else if (memory.contains(s)) {
			return false;
		} else {

			int index = 0;
			String word = "";
			while (index < s.length()) {
				word += s.charAt(index);// add one char at a time
				// check if word already being solved
				if (dict.contains(word)) {
					if (findUsingDP(s.substring(index + 1), dict, memory, answer + word + " ",count+1)) {
						return true;
					} else {
						System.out.println("backtrack");
						index++;
					}
				} else {
					index++;
				}
			}
			memory.add(s);// memoization for future;
			return false;
		}
	}

}
