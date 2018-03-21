package com.rakesh.datastructures.common;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

	public String intToRoman(int num) {
		String[] symbol = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] value = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		int k = 0;
		StringBuilder sb = new StringBuilder();
		while (num > 0 && k < value.length) {
			while (num >= value[k]) {
				System.out.println(" Number " + num + " Roman " + symbol[k]);
				num = num - value[k];
				sb.append(symbol[k]);
			}
			k++;
		}
		return sb.toString();
	}

	public Integer romanToInteger(String s) {

		Map<String, Integer> roman = new HashMap<String, Integer>();

		roman.put("M", 1000);
		roman.put("CM", 900);
		roman.put("D", 500);
		roman.put("CD", 400);
		roman.put("C", 100);
		roman.put("XC", 90);
		roman.put("L", 50);
		roman.put("XL", 40);
		roman.put("X", 10);
		roman.put("IX", 9);
		roman.put("V", 5);
		roman.put("IV", 4);
		roman.put("I", 1);

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			String w = s.substring(i, i <= s.length() - 2 ? i + 2 : i + 1);

			if (roman.containsKey(w)) {
				result += roman.get(w);
				if (w.length() == 2)
					i++;
			} else {
				result += roman.get(s.substring(i, i + 1));
			}
		}

		return result;
	}

	public static void main(String[] a) {
		RomanNumerals i = new RomanNumerals();

		System.out.println(i.intToRoman(1990));
		// System.out.println(i.romanToInteger("MCMXC"));
	}

}
