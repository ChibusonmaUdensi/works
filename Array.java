import java.util.Scanner;
import java.util.Arrays;

   public class Array{
       public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	  int[] scores = new int[10];
	 
	  
	  for (int counter = 0; counter < 10; counter++) {
	  System.out.print("Enter a score: ");
	   scores[counter]= input.nextInt();
	  	
	  }
	
	  System.out.println("The array of scores is:");
	  
	  System.out.print(Arrays.toString(scores));
	  }
   }