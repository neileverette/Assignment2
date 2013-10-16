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

	private static final int MAX_NUM=10;
	
	public void run(){
		for(int i = 0; i < MAX_NUM; i++){
			println("The factorial of " + i + " is " + factorial(i));
		}
	}
	
	// Write a function to cover the Factorial
	private int factorial(int n) {
		
		int result = 1;
		
		for (int j = 1; j < n; j++){
			result *=j;
		}
		return result;
	}

}

