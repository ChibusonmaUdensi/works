import java.util.Scanner;
import java.util.Arrays;

 public class TaskFourMain {
 public static void main(String [] args) {
 Scanner scanner = new Scanner(System.in);
    int[] scores = {6, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int [] evenIndex = TaskFours.EvenIndex(scores);
    int [] oddIndex = TaskFours.OddIndex(scores);

    int evenIndexTotal = TaskFours.EvenIndexTotal(scores);
    int oddIndexTotal = TaskFours.OddIndexTotal(scores);
    int evenIndexMin = TaskFours.EvenIndexMin(scores);
    int oddIndexMin = TaskFours.OddIndexMin(scores);
    int evenIndexMax = TaskFours.EvenIndexMax(scores);
    int oddIndexMax = TaskFours.OddIndexMax(scores);
    int swapArray = TaskFours.SwapArray(newArray);

      System.out.print(Arrays.toString(evenIndex));
      System.out.println("\n" + Arrays.toString(oddIndex));

      System.out.println("Sum of Elements at Even Index: " + evenIndexTotal);
      System.out.println("Sum of Elements at Odd Index: " + oddIndexTotal);
     
      System.out.println("The minimum of Elements at Even Index: " + evenIndexMin);
      System.out.println("The minimum of Elements at Odd Index: " + oddIndexMin);
   
      System.out.println("The maximum of Elements at Even Index: " + evenIndexMax);
     System.out.println("The maximum of Elements at Odd Index: " + oddIndexMax);
     

     int newArray = scanner.nextInt();
     System.out.println("New Array: " + newArray); 
     System.out.print(Arrays.toString(newArray));
  }
 }
