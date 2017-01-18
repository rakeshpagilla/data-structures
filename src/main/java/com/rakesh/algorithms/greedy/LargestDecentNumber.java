package com.rakesh.algorithms.greedy;

import java.util.Scanner;

/*
 *A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
If there are more than one such number, we pick the largest one.
 * */
public class LargestDecentNumber {
	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int t = in.nextInt(); for(int a0
		 * = 0; a0 < t; a0++){ int n = in.nextInt();
		 */ printDecentNumber(14);
		// }
	}

	private static void printDecentNumber(int n) {
		int fives = 0, threes = 0, digits = n;

		while (digits > 0) {
			if (digits % 3 == 0) {
				fives = digits;
				break;
			}

			digits -= 5;
		}

		threes = n - fives;
		System.out.println(threes);

		if (digits < 0 || threes % 5 != 0) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		while (fives-- > 0) {
			sb.append("5");
		}
		while (threes-- > 0) {
			sb.append("3");
		}

		System.out.println(sb.toString());
	}
}
