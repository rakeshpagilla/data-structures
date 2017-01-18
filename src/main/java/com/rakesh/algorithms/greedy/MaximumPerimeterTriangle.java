package com.rakesh.algorithms.greedy;

import java.util.*;

//https://www.hackerrank.com/challenges/maximum-perimeter-triangle. 
//Given  sticks of lengths , use  of the sticks to construct a non-degenerate triangle(a+b > c) with the maximum possible perimeter. 
//Then print the lengths of its sides as  space-separated integers in non-decreasing order.
public class MaximumPerimeterTriangle {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		scanner.close();
		printTriangles(a);
	}

	public static void printTriangles(long[] data) {
		Arrays.sort(data);
		int i = data.length - 3;
		while (i >= 0) {
			if (data[i] + data[i + 1] > data[i + 2]) {
				System.out.println(data[i] + " " + data[i + 1] + " " + data[i + 2]);
				return;
			}
			i--;
		}
		System.out.println(-1);
	}
}
