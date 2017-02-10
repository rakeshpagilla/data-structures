/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *
 *         Created at 9:34:14 PM {1,5,12,25}.. find min coins so that sum is 16.
 *         http://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a
 *         -change/
 */
public class MinimumCoins {

	public static void main(String[] args) {
		int coins[] = { 1, 5, 12, 25 };
		System.out.println(minimumCoinBottomUp( 16, coins));
	}
	
	public static int minimumCoinBottomUp(int total, int coins[]){
		
		int T[] = new int[total+1];
		int R[] = new int[total+1];
		
		T[0] = 0;
		
		for(int i=1 ; i< T.length ; i++){
			T[i] = Integer.MAX_VALUE-1;
			R[i] = -1;
		}
		
		for(int j =0 ; j < coins.length; j++){
			for(int i=1 ; i<= total ; i++){
				if(i >= coins[j]){
					if( 1 + T[i - coins[j]] < T[i]){
						T[i]=	1 + T[i - coins[j]];
						R[i] = j;
					}
				}
			}
		}
		
		printCoins(R,coins);
		return T[total];
	}

	/**
	 * @param r
	 */
	private static void printCoins(int[] R, int[] coins) {
		if (R[R.length - 1] == -1) {
            System.out.print("No solution is possible");
            return;
        }
        int start = R.length - 1;
        System.out.print("Coins used to form total ");
        while ( start != 0 ) {
            int j = R[start];
            System.out.print(coins[j] + " ");
            start = start - coins[j];
        }
        System.out.print("\n");
		
	}

	public static int coinChange(int[] coins, int m, int V) {

		// table[i] will be storing the minimum number of coins
		// required for i value. So table[V] will have result
		int[] table = new int[V + 1];

		// Base case (If given value V is 0)
		table[0] = 0;

		// Initialize all table values as Infinite
		for (int i = 1; i <= V; i++)
			table[i] = Integer.MAX_VALUE;
		// {1,5,12,25}
		// Compute minimum coins required for all
		// values from 1 to V
		for (int i = 1; i <= V; i++) {
			// Go through all coins smaller than i
			for (int j = 0; j < m; j++) {

				if (coins[j] <= i) {
					System.out.println(" Coin examined " + coins[j]);
					int sub_res = table[i - coins[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) {
						System.out.println(" Coin No. " + coins[j] + " Sum Val. " + i + " Value Set to: " + (sub_res + 1));
						table[i] = sub_res + 1;
					}
				}
			}
		}
		for (int i = 1; i <= V; i++) {
			// System.out.println(table[i]);
		}
		System.out.println(table[V]);
		return table[V];
	}
}
