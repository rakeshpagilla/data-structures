/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *
 *         Created at 9:20:51 AM
 *         http://algorithms.tutorialhorizon.com/dynamic-programming-maximum-
 *         size-square-sub-matrix-with-all-1s/
 *
 */
public class MaximumSizeSubSquare {

	public static void main(String[] a) {


		int[][] arrA = { { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 1 } };
		
		subMatrix(arrA);
	}

	public static void subMatrix(int[][] d) {

		int rowLength = d.length;
		int colLength = d[0].length;

		int[][] v = new int[rowLength][colLength];

		for (int i = 0; i < colLength; i++)
			v[0][i] = d[0][i];

		for (int i = 0; i < rowLength; i++)
			v[i][0] = d[i][0];

		for (int i = 1; i < rowLength; i++)
			for (int j = 1; j < colLength; j++) {
				if (d[i][i] == 1) {
					v[i][j] = Math.min(Math.min(v[i][j - 1], v[i - 1][j - 1]), v[i - 1][j]) + 1;
				} else {
					v[i][j] = 0;
				}
			}
		
		int max = 0 ; 
		
		for (int i = 0; i < rowLength; i++)
			for (int j = 0; j < colLength; j++) {
				if (v[i][j] > max) {
					max = v[i][j];
				}
			}
			
		System.out.println(max);

	}

}
