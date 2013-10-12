/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends ConsoleProgram  { //Replace with GraphicsProgram 
	
//	/** Amount of space (in pixels) between tiles */
//	private static final int TILE_SPACE = 20;

	public void run() {

		// This sets how high to 
		int maximumNumber = 10000;
		
		// Variables need for the current number
		int number1=0;
		int number2=1;
		int number3=0;
		
		// Caluculate the 
		while (number3<maximumNumber){
			// Add numbers 1 and 2, set them to be the value of number 3
			number3 = number1 + number2;
			
			// Print the results on screen
			println(number3);
			
			// Reset the previous numbers with the new values
			// Set number 1 to be the value of number 2
			number1=number2;
			
			// Set number 2 to be the value of number 3
			number2=number3;
		}
		
	}
}

