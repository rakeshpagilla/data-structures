/**
 * 
 */
package com.rakesh.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RPagilla 2:45:06 PM 
 * Little Priyanka visited a kids' shop. There are N
 *         toys and their weight is represented by an array W= {w1,w2,w3.. wn}.
 *         Each toy costs 1 unit, and if she buys a toy with weight w', then she
 *         can get all other toys whose weight lies between [w', w'+4] (both
 *         inclusive) free of cost. Find Minimum units with which Priyanka could
 *         buy all of toys.
 */
public class PriyankaToys {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(sc.next());
		}

		System.out.print(findMinimumUnits(array));
	}

	private static Integer findMinimumUnits(Integer[] data) {
		Integer toReturn = 0;

		Arrays.sort(data);
		toReturn = 1; // Buying first item
		Integer lastWeight = data[0] + 4;

		for (Integer a : data) {

			if (a > lastWeight) {
				lastWeight = a + 4;
				toReturn++;
			}
		}

		return toReturn;
	}
}