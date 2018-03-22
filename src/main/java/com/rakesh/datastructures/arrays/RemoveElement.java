package com.rakesh.datastructures.arrays;
/**
 * Created by rakesh at Feb 7, 2018 1:20:31 PM
 * Given an array and a value, remove all instances of that value in place and return
the new length. (Note: The order of elements can be changed. It doesn’t matter what
you leave beyond the new length.)
 */
public class RemoveElement {
	
	public static void main(String[] args){
		
		int result =new RemoveElement().removeElement(new int[]{3, 2,2,3},3);
		System.out.println(result);
	}
	
	private int removeElement( int[] a , int elem){
		int i=0, j=0;
		
		while(j < a.length){
			if(a[j] != elem){
				a[i] = a[j];
				i++;
			}
			j++;
			System.out.println(i + " " + j);
		}
		
		for(Integer k : a)
			System.out.print(k + " ");
		return i;
	}

}
