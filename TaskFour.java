import java.util.Arrays;

 public class Taskfour{
	

 public static int evenIndex(int [] array) {
int length = (arr.length + 1) / 2;
int[] result = new int[length];
for (int i = 0, j = 0; i < 10; i += 2, j++) {
result[j] = arr[i];
}
return result;
   }

	public static void main(String [] args) {
      int[] scores = {2,3,4,3,4,8,9,7,8,4};
    int[] evenIndexArray = evenIndex(scores);
for (int element : evenIndexArray) {
   System.out.print(element + " ");
 }
}
}
