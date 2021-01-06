	package logicStatement;
		import java.util.Scanner;

			public class findingTheSmallestNumber {
				
				public static void main (String[] args){
					Scanner collectNumber = new Scanner(System.in);
							System.out.print("Enter first input ==> ");
								int minimumNumber = collectNumber.nextInt();
									System.out.print("Enter second number ==>");
										int comparedNumber = collectNumber.nextInt();
							if(comparedNumber < minimumNumber){
								minimumNumber = comparedNumber;
							}
								System.out.print("Enter fourth number ==> ");
									int minimumNumkber2 = collectNumber.nextInt();
									
									System.out.print("Enter fifth number ==>");
										int comparedNumber2 = collectNumber.nextInt();
												if(comparedNumber2 < minimumNumkber2){
													comparedNumber2 = minimumNumkber2;
												}
								System.out.print("The minimumNumber is ==> ");
								System.out.println(minimumNumber);
	}

	
}
