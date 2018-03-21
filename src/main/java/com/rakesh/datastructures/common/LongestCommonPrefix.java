package com.rakesh.datastructures.common;

public class LongestCommonPrefix {

	public static void main(String[] a) {

		LongestCommonPrefix lp = new LongestCommonPrefix();
		String[] st = new String[] { "abcde", "abc" , "abn", "aby"};
		String[] st2 = new String[] { "s", "b" , "n", "g"};
		System.out.println(lp.longestCommonPrefix(st2));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1)
			return strs[0];
		
		// Find minimum length of string in the array so that it we could
		//loop no more than the minLen;
		int minLen = Integer.MAX_VALUE;
		for (String str : strs) {
			if (minLen > str.length()) {
				minLen = str.length();
			}
		}
		
		for(int i=0 ; i < minLen ; i++) {
			for(int j=0 ; j < strs.length - 1 ; j++ ) {
				String s1 = strs[j];
				String s2 = strs[j + 1];
				if(s1.charAt(i) != s2.charAt(i)) {
					return s1.substring(0, i);
				}
			}
		}
		
		return strs[0].substring(0, minLen);
	}
}
