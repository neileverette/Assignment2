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

	private static final int SENTINEL = 0;
	
	public void run(){
	
		int total = 0;
		
		while(true){
			int val = readInt("Enter a value: ");
			
			if(val == SENTINEL){
				total += val;
			}
			
		}
		println("The total is " +  + ".");	
	}
}

