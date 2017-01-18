package com.rakesh.datastructures.string;
//Implement atoi to convert a string to an integer.

public class AtoiImpl {

	public static void main(String[] a){
		System.out.println(convert("-1AS"));
	}

	private static Integer convert(String str) {
		
		if(str == null || str.length() < 1)
			return 0;
		
		boolean positiveFlag = true;
		
		int i=0;
		if(str.charAt(0) == '-'){
			i++;
			positiveFlag = false;
		} else if(str.charAt(0) == '+'){
			i++;
		}
		
		double result = 0;
		
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
		
			result = result * 10 + (str.charAt(i) - '0') ;
			i++;
		}
		
		if(!positiveFlag)
			result = -result;
		
		if(result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		if(result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int)result;
	}
}
