package com.rakesh.datastructures.string;


import java.util.*;

public class SuperReducedString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(createReducedText(str));
        
    }
    
    public static String createReducedText(String t){
        
        for(int i=1 ; i <t.length() ; i++){
            if(t.charAt(i) == t.charAt(i-1)){
               t = t.substring(0,i-1) + t.substring(i+1);
               i=0;
            }
        }
        
         if (t.length() == 0) {
            return "Empty String";
        } else {
           return t;
        }
    }
}
