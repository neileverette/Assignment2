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
		
		// Header discription for the application
		println("This application checks for low and high numbers");
		
		// Variables for the application
		int number = readInt("? ");
		int lowNum = number;
		int highNum = number;
		
		while(true){
			
			// Check to see if the number entered is the Sentinel
			if(number == SENTINEL){
				println("You hit the SENTINEL");
				break;
				
			// This checks to see if the number is close to the Sentinel
			}else if (number-1 == SENTINEL){
				println("You are very close");
				highNum = number;
			}else if (number+1 == SENTINEL){
				println("You are very close");
				lowNum = number;
			}
			
			// Once checking for the Sentinel, ask the user for another number
			number = readInt("? ");
			
			// Check and replace high and low numbers
			if (number < lowNum){
				lowNum = number;
			}else if (number > highNum){
				highNum = number;
			}
		}
		
		// Once the Sentinel is guessed, the code will break and display the low and high numbers
		println("Low number is " + lowNum);
		println("High number is " + highNum);
	}
}

