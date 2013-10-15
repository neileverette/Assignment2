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

	// The number of rows in the layout
	private static final int nRows = 9;
	
	// The number of columns in the layout
	private static final int nCols = 8;
	
	public void run(){
		
		// Get the width of the window and divide it by the number of rows
		int sqSize = getWidth()/nRows;
		
		// Simple for loop to 
		for (int i = 0; i < nRows; i++){
			// This is the inner loop to set the rows
			for (int j = 0; j < nCols; j++){
			int x = i * sqSize;
			int y = j * sqSize;
			
			GRect mySquare = new GRect(x, y, sqSize, sqSize);
			mySquare.setFilled(((i+j)%2) ==0);
			add(mySquare);
			}
		}
	
	}

}

