package testingFactorialCodes;

public class FactorialCodeTesting {
	public int findTheFactorialOfTwenty(int number){
		// number == 4
		int answer = 1;
		for (int i = number; i > 0; i--) {
			answer = i * answer;
		}
		return answer;
	}
	
	
}
