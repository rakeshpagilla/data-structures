package com.rakesh.datastructures.string;

import java.util.*;

public class SherlockAndValidStrings {public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   // System.out.println(sherlockValidString("hfchdkkbfifgbgebfaahijchgeeeiagkadjfcbekbdaifchkjfejckbiiihegacfbchdihkgbkbddgaefhkdgccjejjaajgijdkd".trim()));
    System.out.println(sherlockValidString("aabbcd".trim()));
}

   public static String sherlockValidString(String input){
        
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        
        HashMap<Integer, Integer> countCount = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < input.length() ; i++){
            
            if(map.containsKey(input.charAt(i)) ){
                map.put(input.charAt(i), map.get(input.charAt(i))+1);
            }else{
                map.put(input.charAt(i), 1);
            }
        }
        
        for( Map.Entry<Character, Integer> entry: map.entrySet()){
        	if(countCount.containsKey(entry.getValue())){
        	    countCount.put(entry.getValue(), countCount.get(entry.getValue())+1);
        	   }
        	   else{
        	    countCount.put(entry.getValue(), 1);
        	   }
        }
        
        if(countCount.size() == 1){
        	return "YES";
        }else if(countCount.size() ==2){
        	if(countCount.containsValue(1)){
        		return "YES";
        	}else{
        		return "NO";
        	}
        }else{
        	return "NO";
        }
    }
}