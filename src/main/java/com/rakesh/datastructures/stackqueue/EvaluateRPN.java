package com.rakesh.datastructures.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**Elements of Prog Pg 122
 * Evaluate Reverse Polish Notation
 * Created by rakesh at Apr 4, 2018 9:46:58 PM
 */
public class EvaluateRPN {
	
	public static void main(String[] args){
		String exp = "3,4,+,2,*,1,+";
		System.out.println(EvaluateRPN.eval(exp));
	}

	public static int eval(String t){
		Deque<Integer> results = new LinkedList<>();
		String[] symbols = t.split(",");
		
		for(String token:symbols){
			if(token.length() == 1 && "+-*/".contains(token)){
				final int x = results.removeFirst();
				final int y = results.removeFirst();
				switch(token.charAt(0)){
				case '+':
					results.addFirst(x + y);
					break;
				case '-':
					results.addFirst(x - y);
					break;
				case '*':
					results.addFirst(x * y);
					break;
				case '/':
					results.addFirst(x / y);
					break;
				default:
					throw new IllegalArgumentException("malformed exp " + token);
				}
			}else{
				results.addFirst(Integer.parseInt(token));
			}
		}
		return results.removeFirst();
	}
}
