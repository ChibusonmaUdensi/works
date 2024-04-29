import org.junit.jupiter.api.Test; //marking a particular test casemethod //helps to indicate that its a test scenario
import static org.junit.jupiter.api.Assertions.assertEquals; //one of junit methods used for asserting outcomes //assertEquals is a function of class assertions

public class CalculatorTest {


	@Test //marker
	public void testThatCalculatorCanAddTwoPositiveNumbers(){
	int sum = Calculator.add(2,2);
	int expectedSum = 4;
	//assertion
	assertEquals(expectedSum, sum);
	
	}
 	@Test //marker
	public void testThatCalculatorCanSubtractTwoPositiveNumbers(){
	int difference = Calculator.subtract(12,2);
	int expectedDifference = 10;
	//assertion
	assertEquals(expectedDifference, difference);
	
	}
	
	@Test //marker
	public void testThatCalculatorCanAddTwoNegativeNumbers(){
	int addNegative = Calculator.add(-34, -52);
	int expectedNegativeSum = -86;
	//assertion
	assertEquals(expectedNegativeSum, addNegative);
	
	}
	
	@Test //marker
	public void testThatCalculatorCanMultiplyTwoNumbers(){
	int multiply  = Calculator.multiplication(13, 5);
	int expectedProduct = 65;
	//assertion
	assertEquals(expectedProduct, multiply);
	
	}
}