/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *https://www.youtube.com/watch?v=NnD96abizww
 *http://algorithms.tutorialhorizon.com/dynamic-programming-longest-common-subsequence/
 * Created at 8:12:02 PM
 *
 */
public class LongestCommonSubsequence {
	public static void main(String args[]) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String str1 = "ACBDEA";
		String str2 = "ABCDA";

		int result = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
		System.out.print(result);
	}

	/**
	 * @param charArray
	 * @param charArray2
	 * @return
	 */
	private int lcsDynamic(char[] a, char[] b) {
		// TODO Auto-generated method stub
		int lcs[][] = new int[a.length + 1][b.length+1];
		String[][] solution = new String[a.length + 1][b.length + 1];//To print common subsequence.
		for (int i = 0; i < a.length + 1; i++){
			lcs[i][0] = 0;
			solution[i][0] = "0";
		}

		for (int i = 0; i < b.length + 1; i++){
			lcs[0][i] = 0;
			solution[0][i]="0";
		}

		int max =0 ;
		for (int i = 1; i <= a.length; i++) {
			for (int j = 1; j <= b.length; j++) {
				if (a[i - 1] == b[j - 1]) {
					lcs[i][j] = lcs[i-1][j-1]+1;
					solution[i][j] = "diagonal";
				}else{
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
					if(lcs[i][j] == lcs[i-1][j]){
						solution[i][j] = "top";
					}else{
						solution[i][j] = "left";
					}
				}
				
				if(lcs[i][j] > max){
					max = lcs[i][j];
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		String x = solution[a.length][b.length];
		int r = a.length;
		int c = b.length;
		while(x!= "0"){
			switch(solution[r][c]){
			case "diagonal":
				sb.append(a[r-1]);
				r--;
				c--;
				break;
			case "top":
				r--;
				break;
				
			case "left":
				c--;
				break;
			}
			x = solution[r][c] ;
		}
		System.out.println(sb.toString());
		return max;
	}

}
