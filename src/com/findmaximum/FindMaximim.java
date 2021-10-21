//find maximum using generic

package com.findmaximum;

public class FindMaximim {

	//main method
	public static void main(String args[]) {
		
		//Float values
		Float intVal1 = 12.21f, intVal2 = 18.22f, intVal3 = 9.2f;
		
		//assign 1st value to max
		Float max = intVal1;
		
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
