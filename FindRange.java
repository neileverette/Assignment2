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
		
		int number = readInt("? ");
		
		int lowNum = number;
		int highNum = number;
		
		while(true){
			
			
			if(number == SENTINEL){
				println("You hit the SENTINEL");
				break;
			}else if (number-1 == SENTINEL){
				println("You are very close");
				highNum = number;
			}else if (number+1 == SENTINEL){
				println("You are very close");
				lowNum = number;
			}
			
			number = readInt("? ");
		}
		
	//	
	//	println("Low number is " + lowNum);
	//	println("High number is " + highNum);
	}
	
	private int checkSentinel (int x){
		return x;
	}
}

