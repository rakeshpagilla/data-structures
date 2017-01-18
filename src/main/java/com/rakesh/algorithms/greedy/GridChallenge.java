package com.rakesh.algorithms.greedy;

/*
 *Given a squared sized grid  of size  in which each cell has a lowercase letter. Denote the character in the th row and in the th column as .

You can perform one operation as many times as you like: Swap two column adjacent characters in the same row  and  for all valid .

Is it possible to rearrange the grid such that the following condition is true?

In other words, is it possible to rearrange the grid such that every row and every column is lexicographically sorted?


 * */
import java.util.*;

public class GridChallenge {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int inputSize = scanner.nextInt();
		for (int i = 0; i < inputSize; i++) {
			int size = scanner.nextInt();
			char[][] array = new char[size][size];
			for (int j = 0; j < size; j++) {
				String data = scanner.next();
				char[] chars = data.toCharArray();
				Arrays.sort(chars);
				for (int k = 0; k < size; k++) {
					array[j][k] = chars[k];
				}
			}
			System.out.println(validateData(array, size));
		}
	}

	public static String validateData(char[][] data, int size) {
		for (int k = 0; k < size; k++) {
			for (int j = 0; j < size - 1; j++) {
				if (data[j][k] > data[j + 1][k]) {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
