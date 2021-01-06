	package logicStatement;
		import java.util.Scanner;
			public class calculatingTheProductsOfOddNumbers {
				public static void main (String[] args){
					int counter = 1;
					String oddNumber = "3,5,7,9,11,13,15";
						while (counter <= 15){
							System.out.println(counter);
							
							if (counter ==15){
								break;
							}
							counter ++;
						}
							System.out.print("The total sum of the odd number product is ==> ");
								 System.out.println(3*5*7*9*11*13*15);
				}
}
