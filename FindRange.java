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
		
		while(true){
			int number = readInt("Enter a number: ");
			
			if (number == SENTINEL){
				println("You hit the Sentinel");
			}else if (number == SENTINEL - 1 || number == SENTINEL + 1 ){
				println("You are very close");
			}
				
		}
		
	//	println("You hit the SENTINEL");
	//	println("Low number is " + lowNum);
	//	println("High number is " + highNum);
	}
}

