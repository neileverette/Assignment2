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
		
		int rowOneHeight = getHeight()/4 - HEIGHT/2;
		int rowTwoHeight = getHeight()*2/3 - HEIGHT/2;
		
		int box1X = getWidth()/2-WIDTH/2;
		int box2X = getWidth()/3 - WIDTH/2;
		int box3X = getWidth()*2/3 + WIDTH/2;
	
		add(box(box1X, rowOneHeight, WIDTH, HEIGHT, "Program"));
		add(box(box2X, rowTwoHeight, WIDTH, HEIGHT, "GraphicsProgram"));
		add(box(box3X, rowTwoHeight, WIDTH, HEIGHT, "ConsoleProgram"));
	}
	
	private GRect box(int x, int y, int width, int height, String label){
		GRect myRect = new GRect(x,y, width,height);
		add(label(label, x, y));
		return myRect;
	}
	
	private GLabel label(String str, int labelX, int labelY ){
		
		GLabel myLabel = new GLabel(str, labelX, labelY);
		
		double labelWidth = myLabel.getWidth();
		double labelHeight = myLabel.getAscent();
		
		myLabel.setLocation(labelX+((WIDTH-labelWidth)/2),labelY + HEIGHT/2 + labelHeight/2);
		return myLabel;
	}
}

