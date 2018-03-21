package com.rakesh.datastructures.binary;

public class NumberComplement {
	public static void main(String[] args) {
		 int i = 5;
		 System.out.println("Binary Reprsentation of "+ i + " : " + Integer.toBinaryString(i));
		 int highestOneBit = Integer.highestOneBit(i);
		 System.out.println("Highest one bit : " + Integer.toBinaryString(highestOneBit));
		 int shiftBit = highestOneBit << 1;
		 System.out.println("Shift bit : " + Integer.toBinaryString(shiftBit));
		 int mask = shiftBit - 1;
		 System.out.println("Mask is : " + Integer.toBinaryString(mask));
		 System.out.println("Invert " + i + " : " + Integer.toBinaryString(~i));
		 System.out.println("Final result : " + Integer.toBinaryString(~i & mask));
		}
}
