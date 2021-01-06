	package logicStatement;

		public class factorialOfNumber {
			public static void main(String[] args) {
				int counter = 1;
				
				while (counter <= 10) {
					System.out.println(counter);
					
					if (counter == 10) {
						break;
					}
					counter++;
					
				}
				System.out.println(10*9*8*7*6*5*4*3*2*1);
			}
		}
		
		//getting hundred will be very stressful and time taken
		//so my job is to find a better way out of this