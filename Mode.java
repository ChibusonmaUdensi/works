public class Mode {
	public static void main(String [] args) {

int mode = 0;
  int[] arr = {1, 1, 2, 3, 4};

 for (int i = 0; i < arr.length; i++) {
    int count = 0;
 for (int j = 0; j < arr.length; j++) {
   if (arr[i] == arr[j]) {
	count++;
   }

 if (count > mode) {
    mode = count;	
	mode = arr[i];
  }
  }
  }
	return mode;
}

}