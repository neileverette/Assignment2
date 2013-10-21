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
		
		println("This application checks for low and high numbers");
		
		while(true){
			int number = readInt("?");
			int lowNum;
			int highNum;
			
			if(number == SENTINEL){
				println("You hit the SENTINEL");
				break;
			}
		}
		
	//	
	//	println("Low number is " + lowNum);
	//	println("High number is " + highNum);
	}
}

