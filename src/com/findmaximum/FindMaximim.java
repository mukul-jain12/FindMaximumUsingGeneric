//find maximum using generic

package com.findmaximum;

public class FindMaximim {

	//main method
	public static void main(String args[]) {
		
		//Float values
		String strVal1 = "Ram", strVal2 = "Shaam", strVal3 = "Sagar";
		
		//assign 1st value to max
		String max = strVal1;
		
		//checking max with other values
		if (strVal2.compareTo(max) > 0) {
			max = strVal2;
		}
		if (strVal3.compareTo(max) > 0) {
			max = strVal3;
		}
	
		//printing maximum value among three
		System.out.println("Amongst the three the maximum is " + max);
	}
}
