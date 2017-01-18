package com.rakesh.algorithms.greedy;

//You are reading a sequence of strings. you know more than half the strings are repetitive.
//positions of majority elements are unknown. write a  program that pass over the sequence and identifies
// the majority element.Pg 314 elements of prog interview. 
public class FindMajorityElement {

	public static void main(String[] a) {

		String text = "abbaa";
		System.out.println(findMax(text));
	}

	private static char findMax(String text) {

		char max = 0;
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (count == 0) {
				max = text.charAt(i);
				count = 1;
			} else if (max == text.charAt(i)) {
				count++;
			} else {
				count--;
			}
		}
		return max;
	}
}
