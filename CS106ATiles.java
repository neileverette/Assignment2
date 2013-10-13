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

public class CS106ATiles extends GraphicsProgram  { //Replace with GraphicsProgram 

	private static final int SENTINEL = 0;
	
	public void run(){
		
		int total =0;
		
		int val = readInt("Enter a value: ");
		
		while(val != SENTINEL){
			total += val;
			val = readInt("Enter a value: ");
		}
		println("The total is " + total + ".");	
	}
}

