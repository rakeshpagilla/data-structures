/**
 * 
 */
package com.rakesh.datastructures.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RPagilla
 *
 *         Created at 10:30:34 PM
 * 
 *         Given a sorted integer array without duplicates, return the summary
 *         of its ranges for consecutive numbers. For example, given
 *         [0,1,2,4,5,7], return ["0->2","4->5","7"].
 *         
 *         
 *         
Thoughts: basic implementation, use a arraylist to catch candidates. 
Detect condition, and return results.
 *
 */
public class SummaryRanges {

	public static void main(String[] args) {
     int[] data = {1,2,3,4,5,201,202,203};
     System.out.println(printSummaryRanges(data));
	}

	public static List<String> printSummaryRanges(int[] data) {

		List<String> ranges = new ArrayList<String>();
		List<Integer> list = new ArrayList<Integer>();

		for(int i=0 ; i< data.length; i++){
			list.add(data[i]);

			if(i+1 == data.length || data[i] +1 != data[i+1]){

				if(list.size() ==1){
					ranges.add(list.get(0)+"");
				}else{
					ranges.add(list.get(0) + "->" + list.get(list.size()-1));
				}
				list = new ArrayList<Integer>();
			}
		}
		return ranges;
	}
}
