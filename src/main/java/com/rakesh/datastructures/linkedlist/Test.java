package com.rakesh.datastructures.linkedlist;

import java.util.HashMap;

/**
 * Created by rakesh at May 11, 2018 8:19:41 AM
 */
public class Test {

	HashMap<String,String> map = new HashMap<String,String>();
	
	void iter(){
		
		map.put("r1", "done1");
		map.put("r2", "done2");
		map.put("r3", "done3");
		map.put("r4", "done4");
		map.put("r5", "done5");
		
		for(String key :map.keySet()){
			System.out.println(key);
		}
		
		for(String key :map.values()){
			System.out.println(key);
		}
		
		map.forEach((k,v) -> System.out.println("k " + k + " v " + v));
		map.forEach((k,v) -> System.out.println("k " + k + " v " + v));
		
	}
	
	public static void main(String[] a){
		new Test().iter();
	}
}
