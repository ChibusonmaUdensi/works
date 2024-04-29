import java.util.*;
import java.io.*;

public class Personality {
   public static void main(String[] args) throws FileNotFoundException {
      intro();
      
      Scanner console = new Scanner(System.in);
      System.out.print("input file name? ");
      String inputFileName = console.next();
//       System.out.print("output file name? ");
//       String outputFileName = console.next();
      Scanner input = new Scanner(new File(inputFileName));
      
      scanLine(input);
   }
   
   public static void intro() {
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter.  It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
      System.out.println();
   }
   
   public static void scanLine(Scanner input) {
//       int[] aCount = new int[4];
//       int[] bCount = new int[4];
      while (input.hasNextLine()) {
         System.out.print(input.nextLine());
         String test = input.nextLine();
         test = test.toLowerCase();
//          for (int i = 0; i < 70; i++) {
//             if (i % 7 == 0) {
//                if (test.charAt(i) == 'a') {
//                   
//                } else if (test.charAt(i) == 'b'){
//                
//                }
//             }
//          }
         
         char[] testArray = new char[70];
         for(int i = 0; i < 70; i++) {
            testArray[i] = test.charAt(i);
         }
         int[] aCount = scanLineCount(testArray, 'a');
         int[] bCount = scanLineCount(testArray, 'b');
         System.out.println(Arrays.toString(aCount));
         System.out.println(Arrays.toString(bCount));
      }
   }
   
   public static int[] scanLineCount(char[] testArray, char a) {
      int[] count = new int [4];
      for (int i = 0; i < 4; i++) {
         for (int j = 1; j < 70; j += 7) {
            if (testArray[j] == a) {
               count[i]++;
            }
         }
      }
//       for (int i = 0; i < 70; i++) {
//          for (int j = 0; j < 4; j++) {
//             if (testArray[(i + j) % 7 ] == a) {
//                count[j]++;
//             } else if (testArray[(i + j) % 7] == 'b') {
//             
//             }
//          }
//       }
      return count;
   }
}
