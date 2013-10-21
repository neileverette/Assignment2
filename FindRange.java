/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 7;
	
	public void run() {
		
		println("This number finds the largest and smallest numbers");
		int number = readInt("Enter a number: ");
		
		if(number == SENTINEL){
			println("You hit the Sentinel");
		}
		
		int highNum = number;
		int lowNum = number;
		
			
		while(true){
			
			number = readInt("Enter a number: ");
		
			if (number > highNum){
				highNum = number;
			}else if (number < lowNum){
				lowNum = number;
			}else break;
			
		}
		println("You hit the SENTINEL");
		println("Low number is " + lowNum);
		println("High number is " + highNum);
	}
}

