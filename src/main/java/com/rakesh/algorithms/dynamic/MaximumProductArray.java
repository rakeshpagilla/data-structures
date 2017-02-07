/**
 * 
 */
package com.rakesh.algorithms.dynamic;

/**
 * @author RPagilla
 *
 *         Created at 12:56:44 PM 
 *         Find the contiguous subarray within an array
 *         (containing at least one number) which has the largest product.
 * 
 *         For example, given the array [2,3,-2,4], the contiguous subarray
 *         [2,3] has the largest product = 6.
 */
public class MaximumProductArray {
	
	public static void main(String[] args){
		
		Integer[] data = {-2, -3, 0, -2, -40};
		printMaxProduct(data);
	}

	
	private static void printMaxProduct(Integer[] a){
		
		if(a == null || a.length==0)
			return;
		
		Integer maxLocal = a[0];
		Integer minLocal = a[0];
		Integer globalMax = a[0];
		//{-2, -3, 0, -2, -40};
		for(int i=1; i< a.length ; i++){
			int temp = maxLocal;
			maxLocal = Math.max(Math.max(maxLocal*a[i] ,a[i]), minLocal*a[i]);
			minLocal = Math.min(Math.min(temp*a[i], a[i]), minLocal*a[i]);
			globalMax = Math.max(maxLocal, globalMax);
			System.out.println("maxLocal " + maxLocal + " minLocal "  + minLocal + " temp " + temp);
		}
		System.out.println(globalMax);
	}
}
