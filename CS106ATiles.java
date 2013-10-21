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
	private static final int HEIGHT = 100;
	
	public void run(){
		
		// Sets the Y position of the boxes
		int rowOneHeight = getHeight()/4 - HEIGHT/2;
		int rowTwoHeight = getHeight()*2/3 - HEIGHT/2;
		
		// Sets the X position of the boxes
		int box1X = getWidth()/2-WIDTH/2;
		int box2X = (getWidth()/3 - WIDTH)/2;
		int box3X = (getWidth()*2/3) + (getWidth()/3 - WIDTH)/2;
		
		// Coordinates of the lines
	
		// Adds 4 boxes on the screen
		add(box(box1X, rowOneHeight, WIDTH, HEIGHT, "Program"));
		add(box(box2X, rowTwoHeight, WIDTH, HEIGHT, "GraphicsProgram"));
		add(box(box1X, rowTwoHeight, WIDTH, HEIGHT, "ConsoleProgram"));
		add(box(box3X, rowTwoHeight, WIDTH, HEIGHT, "DialogProgram"));
	}
	
	private GRect box(int x, int y, int width, int height, String label){
		GRect myRect = new GRect(x,y, width,height);
		
		// Get connection points for box
		double xPos = myRect.getX();
		double yPos = myRect.getY();
		
		// Call method to add a label
		add(label(label, x, y));
		
		// Call method to add a line
		
		
		add (line(getWidth()/2,getHeight()/4 + HEIGHT/2,xPos, yPos));
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

