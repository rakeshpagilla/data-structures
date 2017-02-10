package com.rakesh.algorithms.dynamic;

/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
How many possible unique paths are there?
https://www.youtube.com/watch?v=GO5QHC_BmvM&list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr&index=39
 */
public class UniquePaths {

	public static void main(String[] a) {
		
		System.out.println(uniquePaths(3, 3));

	}

	public static int uniquePaths(int m, int n) {
        int T[][] = new int[n][m];
        for(int i=0; i < n; i++){
            T[i][0] = 1;
        }
        
        for(int i=0; i < m; i++){
            T[0][i] = 1;
        }
        for(int i=1; i < n; i++){
            for(int j=1; j < m; j++){
                T[i][j] = T[i-1][j] + T[i][j-1];
            }
        }
        return T[n-1][m-1];
	}

}
