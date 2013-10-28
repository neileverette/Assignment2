
import acm.program.ConsoleProgram;
import acm.util.*;

public class RandomNumber extends ConsoleProgram {
	
	public void run(){
		
		// Variables
		int r = rgen.nextInt(5, 50);
		int x = rgen.nextInt(0, getWidth()-2*r);
		
	while(x < 5){
			println(x);
			x = rgen.nextInt(0, getWidth()-2*r);
		}
		
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();


}
