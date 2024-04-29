public class ArrayFunctions{

	public static int add(int firstNumber, int secondNumber) {

	   return firstNumber + secondNumber;	
	}

	public static int add(int firstNumber, int secondNumber, int thirdNumber)
{
	  return ad(add(firstNumber, secondNumber), thirdNumber);

	}

	public static int add(int length, int...numbers) {
		int total = 0;

		for(int i = 0; i < length; i++) {
		total += numbers[i]
		}

		return total;
   
}