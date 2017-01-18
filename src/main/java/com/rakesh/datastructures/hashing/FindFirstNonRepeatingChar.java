package com.rakesh.datastructures.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstNonRepeatingChar {

	public static void main(String[] a) {

		System.out.println(findNonRepeatingChars("abcdefghija"));
	}

	private static Character findNonRepeatingChars(String word) {
		
		if(word.length() == 0)
			return null;

		List<Character> nonRepeatingList = new ArrayList<Character>();
		Set<Character> repeatingSet = new HashSet<Character>();

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			System.out.println(c + " " + i);
			
			if(repeatingSet.contains(c))
				continue;
			
			if (nonRepeatingList.contains(c)) {
				nonRepeatingList.remove((Character)c);// Its important to type cast your character.
				repeatingSet.add(c);
			} else {
				nonRepeatingList.add(c);
			}
		}
		return nonRepeatingList.get(0);
	}

}
