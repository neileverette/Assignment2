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
	
//	/** Amount of space (in pixels) between tiles */
//	private static final int TILE_SPACE = 20;

	public void run() {
		
		int faceWidth = 200;
		int faceHeight = 350;
		
		int faceXPosition = getWidth()/2 - faceWidth/2;
		int faceYPosition = getHeight()/2 - faceHeight/2;
		
		GRect myRect = new GRect(faceXPosition,faceYPosition,faceWidth,faceHeight);
		myRect.setFilled(true);
		myRect.setColor(Color.gray);
		add(myRect);

	
		
	}
}

