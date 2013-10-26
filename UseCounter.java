
import acm.program.*;

public class UseCounter extends ConsoleProgram{


	public void run() {
		
		Incrementor count1 = new Incrementor(); // starts at 1
		
		println("Five values for count1:");
		countFiveTimes(count1);
		
	}
	
	private void countFiveTimes(Incrementor counter){
		for (int i = 0; i < 5; i++){
			println(counter.nextValue());
		}
	}

}
