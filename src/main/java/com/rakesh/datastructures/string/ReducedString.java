/**
 * 
 */
package com.rakesh.datastructures.string;

/**
 * @author RPagilla 
 *
 * Created at 10:46:30 AM
 *
 */
public class ReducedString {

	public static void main(String[] a){
		printReducedString("aaaabbcccc");
	}
	
	public static void printReducedString(String txt){
		
		Integer i =1;
		Integer index =0;
		StringBuilder output =new StringBuilder();
		while(index < txt.length()){
			if(index < txt.length()-1 && txt.charAt(index) == txt.charAt(index+1)){
				i++;
				index++;
				continue;
			}
			output.append(i);
			output.append(txt.charAt(index));
			i=1;
			index++;
		}
		
		System.out.println(output.toString());
	}
}
