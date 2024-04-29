public class Asterisks {
	public static void main(String...kll) {
	   printHalfDiamond(7);

}

	public static void printHalfDiamond(int lengthOfDiamond) {
	 printFirstTriangle(lengthOfDiamond);
	 printSecondTriangle(lengthOfDiamond - 1);
  }

	public static void printFirstTriangle(int length) {
	   for(int = 1; i <= length; i++) {
	     printStarAndSpace(i);
	   }


	public static void printSecondTriangle(int length) {
	   for (int i =length; i >= 1; i--) {
		printStarAndSpace(i);
	   }
	}

	public static void printStar
