package com.rakesh.datastructures.string;

import java.util.Scanner;
/*Sami's spaceship crashed on Mars! She sends  sequential SOS messages to Earth for help.
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission. 
 * Given the signal received by Earth as a string,S , determine how many letters 
 * of Sami's SOS have been changed by radiation.*/
public class SosMars {

	    public static void main(String[] args) {
	       // Scanner in = new Scanner(System.in);
	        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
	        int d = 0;
	        int len = s.length();
	        for(int i=0 , j=1, k=2; i < len; i = i+3 , k= k+3 , j= j+3){
	            if(i < len && s.charAt(i) != 'S' ){
	                d++;
	            }
	            if(j < len && s.charAt(j) != 'O' ){
	                d++;
	            }
	            if(k < len && s.charAt(k) != 'S' ){
	                d++;
	            }
	        }
	        
	        System.out.println(d);
	    }
	}