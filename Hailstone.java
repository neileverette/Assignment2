/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		int myNum = readInt("Enter a number: ");
		int counter = 1;
		
		while (myNum != 1){
			if (myNum%2==0){
				println(myNum + " is even so I take half: " + myNum/2);
				myNum = myNum/2;
			
			}else {
				println(myNum + " is odd so I make 3n+1: " + 3*myNum + 1);
				myNum = 3*myNum + 1;
			}counter++;
		}println("It took " + counter + " steps");
	}
}

