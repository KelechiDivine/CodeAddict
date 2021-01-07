import org.junit.jupiter.api.Test;
import testingFactorialCodes.FactorialCodeTesting;

import static org.junit.jupiter.api.Assertions.*;


class FactorialCodeTestingTest {
	FactorialCodeTesting factorialCodeTesting = new FactorialCodeTesting();
	
	@Test
	void FindingTheFactorialOfIntTwenty() {
		int result = factorialCodeTesting.findTheFactorialOfTwenty(4);
		assertEquals(result, 24);
	}
}
	
	
