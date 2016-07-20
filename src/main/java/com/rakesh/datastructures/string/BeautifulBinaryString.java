package com.rakesh.datastructures.string;

import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int steps = 0;
        
        for(int i=0; i <= n-3 ;  ){
            
            if(b.substring(i, i+3).equals("010")){
                steps++;
                i = i+3;
            }else{
                i++;
            }
        }
        
        System.out.println(steps);
    }
}
