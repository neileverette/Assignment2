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
		
		// Dimensions for the face
		int faceWidth = 200;
		int faceHeight = 350;
		
		int faceXPosition = getWidth()/2 - faceWidth/2;
		int faceYPosition = getHeight()/2 - faceHeight/2;
		
		// Dimensions for the mouth
		int mouthWidth = faceWidth/2;
		int moughHeight = faceWidth/6;
		
		int mouthXPosition = 200;
		int mouthYPosition = 400;
		
		
		// Face
		GRect faceRect = new GRect(faceXPosition,faceYPosition,faceWidth,faceHeight);
		faceRect.setFilled(true);
		faceRect.setColor(Color.gray);
		
		// Mouth
		GRect mouthRect = new GRect(mouthXPosition,mouthYPosition,mouthWidth,moughHeight);
		mouthRect.setFilled(true);
		mouthRect.setColor(Color.red);
		
		
		
		
		// Add the elements to the screen
		add(faceRect);
		add(mouthRect);

	
		
	}
}

