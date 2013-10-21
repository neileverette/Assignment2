/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINAL = 7;
	
	public void run() {

		int lowestNumber = 0;
		int higestNumber = 0;
		
		while(true){
			// Ask the user for a number
			int number = readInt("Enter a number: ");
			
			if(number > number){
				lowestNumber = number;
			}
			
			// Check for the SENTINEL
			if (number == SENTINAL)break;
		}
		
		println(lowestNumber);		
	}
}

