
public class Incrementer {

		
		public Incrementer(int startValue){
			counter = startValue;
		}
		
		public Incrementer(){
			counter = 1;
		}
		
		private int nextValue(){
			int temp = counter;
			counter++;
			return temp;
		}

		private int counter;
	}