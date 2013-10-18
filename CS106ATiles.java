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
import acm.util.*;

public class CS106ATiles extends ConsoleProgram  { //Replace with GraphicsProgram 
	
	private static final int NUM_SIDES = 6;
	
	
	public void run(){
		int numDice = readInt("Number of dice: ");
		int maxRoll = numDice * NUM_SIDES;
		int numRolls = 0;
		while(true){
			int roll = rollDice(numDice);
			numRolls++;
			if (roll == maxRoll) break;
			println("Rolled " + roll);
		}
		println("Rolled " + maxRoll + " after " + numRolls + " rolls." );
		
	}
	
	private int rollDice(int numDice){
		int total = 0;
		for(int i = 0; i < numDice; i++){
			total = += rgen.nextInt(1, NUM_SIDES);
		}
		return total;
	}
	
}

