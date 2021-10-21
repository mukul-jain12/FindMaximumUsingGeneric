//find maximum using generic

package com.findmaximum;

public class FindMaximim {

	//main method
	public static void main(String args[]) {
		
		//Float values
		Float floatVal1 = 12.21f, floatVal2 = 18.22f, floatVal3 = 9.2f;
		
		//assign 1st value to max
		Float max = floatVal1;
		
		//checking max with other values
		if (floatVal2.compareTo(max) > 0) {
			max = floatVal2;
		}
		if (floatVal3.compareTo(max) > 0) {
			max = floatVal3;
		}
	
		//printing maximum value among three
		System.out.println("Amongst the three the maximum is " + max);
	}
}
