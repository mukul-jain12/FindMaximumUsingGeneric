//find maximum using generic

package com.findmaximum;

public class FindMaximim {

	//main method
	public static void main(String args[]) {
		
		//integer values
		Integer intVal1 = 12, intVal2 = 13, intVal3 = 9;
		
		//assign 1st value to max
		Integer max = intVal1;
		
		//checking max with other values
		if (intVal2.compareTo(max) > 0) {
			max = intVal2;
		}
		if (intVal3.compareTo(max) > 0) {
			max = intVal3;
		}
	
		//printing maximum value among three
		System.out.println("Amongst the three the maximum is " + max);
	}
}
