/**
 * 
 */
package com.rakesh.datastructures.common;

/**
 * @author RPagilla 
 * Given two string s1 and s2, find if s1 can be converted to s2 with exactly one edit. 
 * Expected time complexity is O(m+n) where m and n are lengths of two strings.
 *
 * Created at 6:54:08 PM
 * Input:  s1 = "geeks", s2 = "geek"
Output: yes
Number of edits is 1

Input:  s1 = "geeks", s2 = "geeks"
Output: no
Number of edits is 0

Input:  s1 = "geaks", s2 = "geeks"
Output: yes
Number of edits is 1
 *
 */
public class OneEditDistance {

 public static void main(String[] args){
	 System.out.println(checkEditDistance("GEEKS" ,"GEEK"));
	 System.out.println(checkEditDistance("GEEKS" ,"GEOK"));
	 System.out.println(checkEditDistance("geaks" ,"geeks"));
	 System.out.println(checkEditDistance("peaks" ,"geeks"));
 }

	public static boolean checkEditDistance(String s, String t){
       
       if(Math.abs(s.length()-t.length())>1){
       	return false;
       }
        
        int m = s.length();
        int n = t.length();
        int i=0, j=0,count=0;

        while(i < m && j < n ){
        	if(count > 1){
        		return false;
        	}

        	if(s.charAt(i) != t.charAt(j)){
        		count++;
        	}
        	i++;
        	j++;
        } 

      if(count >0 && Math.abs(m-n) >0){
      	return false;
      }

      return true;
	}

}
