import java.util.Scanner;
import java.util.Arrays;

   public class TaskThree {
       public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	  int[] scores = new int[10];
	 
	  
	  for (int counter = 0; counter < 10; counter++) {
	  System.out.print("Enter a score: ");
	   scores[counter]= input.nextInt();
	  	
	  }
	
	  for (int element : scores) {
	   System.out.print(element + " ");
	  }
	System.out.println();
   }
}