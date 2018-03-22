package com.rakesh.datastructures.arrays;

/**
 * Created by rakesh at Feb 14, 2018 9:37:24 PM
 */
public class FirstMissingPositiveInteger {

	public static void main(String[] a){
	
		int[] test1 = new int[]{3,1,-1,3};
		//int[] test1 = new int[]{1,2,0};
		int val = new FirstMissingPositiveInteger().firstMissingPositive(test1);
		System.out.println(" ** " +val);
	}
	
	public int firstMissingPositive(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			for(int t : nums){
				System.out.print(t + " ");
			}
			System.out.println();
			
			if (nums[i] != i + 1 && nums[i] > 0 && nums[i] <= nums.length
					&& nums[i] != nums[nums[i] - 1]) {
				int t = nums[nums[i] - 1]; // cache this number first, other
											// wise won't work.
				nums[nums[i] - 1] = nums[i];
				nums[i] = t;
				i--;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}

		return nums.length + 1;
	}

}
