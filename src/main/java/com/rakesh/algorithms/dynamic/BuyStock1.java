package com.rakesh.algorithms.dynamic;

import java.lang.Math;

public class BuyStock1 {

	public static void main(String[] a) {
		
		int[] prices = {3,7,1,6,5};
		
		System.out.println("Max Profit " + maxProfit(prices) );

	}

	private static int maxProfit(int[] prices) {

		int maxProfit = 0;
		int minElement = prices[0];

		for (int i = 1; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit, prices[i] - minElement);
			minElement = Math.min(minElement, prices[i]);
		}
		return maxProfit;
	}
}
