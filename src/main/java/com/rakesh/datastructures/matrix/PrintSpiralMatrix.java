package com.rakesh.datastructures.matrix;

public class PrintSpiralMatrix {

	public static void main(String[] a) {

		int[][] mat = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		printSpirally(mat);
	}

	private static void printSpirally(int[][] mat) {

		int m = mat.length;
		int n = mat[0].length;
		System.out.println(m + " " + n);

		int x = 0, y = 0;

		while (m > 0 && n > 0) {

			if (m == 1) {
				for (int i = 0; i < n; i++)
					System.out.println(mat[x][y++]);
				break;
			} else if (n == 1) {
				for (int i = 0; i < m; i++)
					System.out.println(mat[x++][y]);
				break;
			}

			// Top left to right
			for (int i = 0; i < n - 1; i++) {
				System.out.println(mat[x][y++]);
			}

			// right - move down
			for (int i = 0; i < m - 1; i++) {
				System.out.println(mat[x++][y]);
			}

			// left - right down
			for (int i = 0; i < n - 1; i++) {
				System.out.println(mat[x][y--]);
			}
			// left move up
			for (int i = 0; i < m - 1; i++) {
				System.out.println(mat[x--][y]);
			}
			System.out.println(" m" + m + " n" + n);

			x++;
			y++;

			m = m - 2;
			n = n - 2;

		}
	}

}
