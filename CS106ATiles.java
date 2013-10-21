/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
//import java.awt.*;
//import acm.util.*;



public class CS106ATiles extends GraphicsProgram  { //Replace with GraphicsProgram 
	
	private static final int WIDTH = 200;
	private static final int HEIGHT = 75;
	
	public void run(){
		
		// Sets the Y position of the boxes
		int rowOneHeight = getHeight()/4 - HEIGHT/2;
		int rowTwoHeight = getHeight()*2/3 - HEIGHT/2;
		
		// Sets the X position of the boxes
		int box1X = getWidth()/2-WIDTH/2;
		int box2X = (getWidth()/3 - WIDTH)/2;
		int box3X = (getWidth()*2/3) + (getWidth()/3 - WIDTH)/2;
		
	
		// Adds 4 boxes on the screen
		add(box(box1X, rowOneHeight, WIDTH, HEIGHT, "Program", false));
		add(box(box2X, rowTwoHeight, WIDTH, HEIGHT, "GraphicsProgram", true));
		add(box(box1X, rowTwoHeight, WIDTH, HEIGHT, "ConsoleProgram", true));
		add(box(box3X, rowTwoHeight, WIDTH, HEIGHT, "DialogProgram", true));
	}
	
	private GRect box(int x, int y, int width, int height, String label, boolean line ){
		GRect myRect = new GRect(x,y, width,height);
		
		// Get connection points for box
		double xPos = myRect.getX() + WIDTH/2;
		double yPos = myRect.getY();
		
		// Call method to add a label
		add(label(label, x, y));
		
		
		if (line == false){
			double connectorX = myRect.getX() + WIDTH/2 ;
			double connectorY;
		}
		
		// Call method to add a line
		if (line){ // check to see if the box needs a line
			add (line(connectorX,getHeight()/4 + HEIGHT/2,xPos, yPos));
		}
		return myRect;
	}
	
	private GLabel label(String str, int labelX, int labelY ){
		
		GLabel myLabel = new GLabel(str, labelX, labelY);
		
		double labelWidth = myLabel.getWidth();
		double labelHeight = myLabel.getAscent();
		
		myLabel.setLocation(labelX+((WIDTH-labelWidth)/2),labelY + HEIGHT/2 + labelHeight/2);
		return myLabel;
	}

	private GLine line(double x0, double y0, double x1, double y1){
		GLine myLine = new GLine(x0, y0, x1, y1);
		return myLine;
	
	}
}

