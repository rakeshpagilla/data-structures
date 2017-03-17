/**
 * 
 */
package com.rakesh.datastructures.common;

/**
 * @author RPagilla
 *
 *         Created at 1:33:15 PM
 *
 *         Given an array of size n, find the majority element. The majority
 *         element is the element that appears more than [ n/2 ] times. (assume
 *         that the array is non-empty and the majority element always exist in
 *         the array.)
 */
public class MajorityElement {
	public static void main(String[] a){
	
		int[] data = {3,4,3,4,4};
		System.out.println(findMajorityElement(data));
	}

	public static int findMajorityElement(int[] num){

		int result =0;
		int count = 0;

		for(int i=0 ; i< num.length; i++){
			if(count == 0){
				result = num[i];
				count = 1;
			}else if(result == num[i]){
				count++;
			}else{
				count--;
			}
			System.out.println(result + " " + count);
		}
		return result;
	}
}
