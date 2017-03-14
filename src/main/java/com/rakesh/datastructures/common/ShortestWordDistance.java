/**
 * 
 */
package com.rakesh.datastructures.common;

import java.util.ArrayList;
import java.util.List;
/**
 * @author RPagilla 
 *
 * Created at 9:36:03 PM
 *Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
For example, Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
Given word1 = “coding”, word2 = “practice”, return 3. Given word1 = "makes", word2 = "coding", return 1.
 */
public class ShortestWordDistance {
	
	public static void main(String[] a){
		
		List<String> list = new ArrayList<String>();
		list.add("practice");
		list.add("makes");
		list.add("perfect");
		list.add("coding");
		list.add("makes");
		System.out.println(shortestDistance(list,"coding","practice"));
		System.out.println(shortestDistance(list,"makes","coding"));
	}
	
public static int shortestDistance(List<String> words, String word1, String word2){

	int m= -1, n= -1;

	int min = Integer.MAX_VALUE;

	for(int i=0 ; i< words.size(); i++){

		if(words.get(i).equals(word1)){
			m=i;
			if(n != -1){
				min = Math.min(min, m-n);
			}
		}else if(words.get(i).equals(word2)){
			n=i;
			if( m != -1){
				min = Math.min(min, n-m);
			}
		}
	}
	return min;
}	

}
