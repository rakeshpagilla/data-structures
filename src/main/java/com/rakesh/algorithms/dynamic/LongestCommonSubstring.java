/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *
 *         Created at 8:46:53 AM
 *
 */
public class LongestCommonSubstring {
	public static void main(String[] args) {
		String A = "tutorialhorizon";
		String B = "dynamictutorialProgramming";
		System.out.println("LCS length : " + find(A, B));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	private static int find(String a, String b) {
		// TODO Auto-generated method stub
		int m = a.length();
		int n = b.length();

		int max = -1;
		int[][] lcs = new int[m][n];
		int r=0, c=0;//For printing the text

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (a.charAt(i) == b.charAt(j)) {
					if (i == 0 || j == 0) {
						lcs[i][j] = 1;
					} else {
						lcs[i][j] = lcs[i - 1][j - 1] + 1;
					}
					if (lcs[i][j] > max) {
						max = lcs[i][j];
						r=i;
						c=j;
					}
				}
			}
		}
		
		StringBuilder sb =  new StringBuilder();
		for(;r>=0 && c>=0; r--, c--){
			sb.append(a.charAt(r));
		}
		System.out.println(sb.reverse());
		return max;
	}

}
