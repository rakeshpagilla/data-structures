package com.rakesh.algorithms.dynamic;

public class ContainerWithMostWater {

	public static void main(String[] a) {
		int input[] = { 1,2,2,3,1};
		System.out.println(maxArea(input));
	}

	public static int maxArea(int[] height) {
		
		if(height == null && height.length <2)
			return 0;

		int left = 0, max = 0, right = height.length - 1;

		while (left < right) {
			max = Math.max(Math.min(height[left], height[right]) * (right - left), max);

			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}

		}

		return max;
	}

}
