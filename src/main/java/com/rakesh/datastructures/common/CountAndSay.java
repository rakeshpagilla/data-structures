package com.rakesh.datastructures.common;

/**
 * Created by rakesh at Feb 9, 2018 10:34:27 PM
 */
public class CountAndSay {
	
	public static void main(String[] args){
		
		for(int i =0 ; i <= 8 ;i ++)
		System.out.println(new CountAndSay().countAndSay(i));
	}

	private String countAndSay(int n) {
		String res = "1";

		for (int i = 0; i < n; i++) {
			int count = 1;
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j < res.length(); j++) {

				if (res.charAt(j) == res.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count).append(res.charAt(j - 1));
					count = 1;
				}
			}
			sb.append(count);
			sb.append(res.charAt(res.length() - 1));
			res = sb.toString();
		}
		return res;
	}

}
