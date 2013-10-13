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
		int faceWidth = 250;
		int faceHeight = 400;
		
		int faceXPosition = getWidth()/2 - faceWidth/2; // Get the 
		int faceYPosition = getHeight()/2 - faceHeight/2;
		
		// Dimensions for the mouth
		int mouthWidth = faceWidth/2; // Set the mouth to be 1/2 of the overall face width
		int mouthHeight = faceWidth/6; // Set the height of the mouth to be 1/6 of the overall face height
		
		int mouthXPosition = getWidth()/2-mouthWidth/2;
		int mouthYPosition = getHeight()/2+faceHeight/2 ;
		
		
		// Face
		GRect faceRect = new GRect(faceXPosition,faceYPosition,faceWidth,faceHeight);
		faceRect.setFilled(true);
		faceRect.setColor(Color.gray);
		
		// Mouth
		GRect mouthRect = new GRect(mouthXPosition,mouthYPosition,mouthWidth,mouthHeight);
		mouthRect.setFilled(true);
		mouthRect.setColor(Color.red);
		
		// 1/4 Mark row
		int oneQuarterYPosition = getHeight()/2 - faceHeight/2 ;
		
		GRect oneQuarterRect = new GRect(faceXPosition,oneQuarterYPosition,faceWidth,faceHeight/4);
		oneQuarterRect.setFilled(true);
		oneQuarterRect.setColor(Color.LIGHT_GRAY);
		
		
		
		
		// Add the elements to the screen
		add(faceRect);
		add(mouthRect);
		add(oneQuarterRect);

	
		
	}
}

