public class Calculator {

	public static int add(int firstNumber, int secondNumber) {

		return firstNumber + secondNumber; 
     }

	public static int subtract(int firstNumber, int secondNumber) {

		return firstNumber - secondNumber;
     }


	public static int addNegatives(int firstNumber, int secondNumber) {

		return firstNumber - secondNumber;
     }
	public static int multiplication(int firstNumber, int secondNumber) {
		int value = 0;
		for (int i = 0; i < secondNumber; i++) {
			value += firstNumber;
		}
		return value;
     }

	
}