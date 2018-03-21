package com.rakesh.datastructures.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

public class KeyboardRow {
	
	public static void main(String[] a){
		String[] d = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(returnList(d ));
	}

	private static List<String> returnList(String[] words) {

		List<String> toReturn = new ArrayList<String>();

		String[] keyArray = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < keyArray.length; i++) {
			for (char c : keyArray[i].toCharArray()) {
				charMap.put(c, i);
			}
		}

		for (String word : words) {
			int index = charMap.get(word.toUpperCase().charAt(0));
			boolean flag = true;
			for (int j = 1; j < word.length(); j++) {
				int currIndex = charMap.get(word.toUpperCase().charAt(j));
				if (index != currIndex) {
					flag = false;
					continue;
				}
			}
			if (flag)
				toReturn.add(word);
		}
		return toReturn;
	}
}
