/**
 * 
 */
package com.rakesh.datastructures.string;

/**
 * @author RPagilla
 *
 *         Created at 10:47:01 AM
 *         http://www.practice.geeksforgeeks.org/problem-page.php?pid=282
 */
public class PrintReverseWords {
	public static void main(String[] args) {
		// code
		printReverse("i.like.this.program.very.much");
	}

	public static void printReverse(String text) {

		String[] textArray = text.split("\\.");
		StringBuilder sb = new StringBuilder();

		for (int i = textArray.length - 1; i >= 0; i--) {
			sb.append(textArray[i]);
			if (i != 0)
				sb.append(".");
		}

		System.out.println(sb.toString());
	}
}