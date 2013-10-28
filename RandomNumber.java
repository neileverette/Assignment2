
import acm.program.ConsoleProgram;
import acm.util.*;

public class RandomNumber extends ConsoleProgram {
	
	public void run(){
		
		// Variables
		double y = rgen.nextDouble(0, 10);
		int r = rgen.nextInt(5, 50);
		int x = rgen.nextInt(0, 10);
		
	while(x > 0){
			println(x);
			x = rgen.nextInt(0, 10);
		}
		
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();


}
