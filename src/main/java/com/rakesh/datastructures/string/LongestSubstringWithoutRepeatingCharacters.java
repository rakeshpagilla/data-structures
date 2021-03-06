/**
 * 
 */
package com.rakesh.datastructures.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author RPagilla
 *
 *         Created at 3:57:22 PM Given a string, find the length of the longest
 *         substring without repeating characters. For example, the longest
 *         substring without repeating letters for "abcabcbb" is "abc", which
 *         the length is 3. For "bbbbb" the longest substring is "b", with the
 *         length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		System.out.println(findMax("abcddddefghijk"));

	}

	public static int findMax(String s) {

		Set<Character> set = new HashSet<Character>();
		int max = 0, i=0,j=0;
		int n = s.length();
		while(i < n && j < n){
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j));
				j++;
				max = Math.max(max,j-i);
			}else{
				set.remove(s.charAt(i));
				i++;
			}
		}

		return max;
	}

}
