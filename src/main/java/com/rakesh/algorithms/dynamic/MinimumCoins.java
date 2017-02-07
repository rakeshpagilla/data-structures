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
		coinChange(coins, coins.length, 16);
	}
	
	public int minimumCoinBottomUp(int total, int coins[]){
		
		return 0;
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
