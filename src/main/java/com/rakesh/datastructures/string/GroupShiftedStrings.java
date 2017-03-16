/**
 * 
 */
package com.rakesh.datastructures.string;

import java.util.*;

/**
 * @author RPagilla
 * Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:
"abc" -> "bcd" -> ... -> "xyz"
Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.
For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"], 
Return:
[
  ["abc","bcd","xyz"],
  ["az","ba"],
  ["acef"],
  ["a","z"]
]

Check this why "eqdf" is a group of "qcpr"
["eqdf", "qcpr"]
((‘q’ - 'e') + 26) % 26 = 12, ((‘d’ - 'q') + 26) % 26 = 13, ((‘f’ - 'd') + 26) % 26 = 2
((‘c’ - 'q') + 26) % 26 = 12, ((‘p’ - 'c') + 26) % 26 = 13, ((‘r’ - 'p') + 26) % 26 = 2
 *
 *         Created at 10:21:11 PM
 *         https://hzhou.me/LeetCode/LeetCode-Group-Shifted-Strings.html
 *
 */
public class GroupShiftedStrings {
	
	public static void main(String[] args){
		String[] data = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
		List<List<String>> list = groupStrings(data);
		
		for(List<String> l: list){
			System.out.println(l);
		}
	}

	public static List<List<String>> groupStrings(String[] strings) {

		List<List<String>> result = new ArrayList<List<String>>();

		Map<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();


		for(String s: strings){
			String code  = findStringCode(s);
			ArrayList<String> strList = new ArrayList<String>();

			if(map.containsKey(code)){
				map.get(code).add(s);
			}else{
				strList.add(s);
				map.put(code,strList);
			}
		}

	/*	for(ArrayList<String> list:map.values()){
			Collections.sort(list);
			result.add(list);
			}
			*/

		for(Map.Entry<String,ArrayList<String>> entry :map.entrySet()){
			Collections.sort(entry.getValue());
			result.add(entry.getValue());
		}

		return result;
	}

	public static String findStringCode(String str){

		StringBuilder sb = new StringBuilder();
		sb.append("#");

		for(int i =1 ; i< str.length() ; i++){
			int val = ((str.charAt(i) - str.charAt(i - 1)) + 26) % 26;
			sb.append(val).append("#");
		}
		System.out.println(str + " " + sb.toString());
		return sb.toString();
	}
}
