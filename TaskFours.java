public class TaskFours {
public static int[] EvenIndex(int[] scores) {

int[] evenIndex = new int[(scores.length) / 2];
	int j = 0;
     for (int counter = 0; counter < scores.length; counter = counter + 2) {
	evenIndex[j] = scores[counter];
	j++;
      }
  return evenIndex;


}


public static int[] OddIndex(int[] scores) {

int [] oddIndex = new int[(scores.length/2)];
	int i = 0;
   for (int count = 1; count < scores.length; count = count + 2) {
	oddIndex[i] = scores[count];
	i++;
    }
  return oddIndex;


  }

public static int EvenIndexTotal(int[] scores) {
	int total = 0;
   for (int count = 0; count < scores.length; count = count + 2) {
 
   total += scores[count];
    }
 
    return total;
    }

public static int OddIndexTotal (int [] scores) {
	int total = 0;
   for (int count = 1; count < scores.length; count = count + 2) {

   total += scores[count];
    }

    return total;
    }


public static int EvenIndexMin(int [] evenIndex) {
 int minimum =0;
	minimum = evenIndex[0];
	for ( int i = 0;  i < evenIndex.length; i = i + 2) {

	if (evenIndex[i] < minimum) {
	  minimum = evenIndex[i];
        }
        }

	return minimum;
}

public static int OddIndexMin(int [] oddIndex) {
 
  int minimum = oddIndex[0];
	for (int i = 1; i < oddIndex.length; i = i + 2) {

	if (oddIndex[i] < minimum) {
	   minimum = oddIndex[i];
	}
	}
	
	return minimum;
}

public static int EvenIndexMax(int [] evenIndex) {

   int maximum = evenIndex[0];
	for (int i = 0; i < evenIndex.length; i+=2) {

	if (evenIndex[i] > maximum) {
	   maximum = evenIndex[i];
	}
	}

	return maximum;
}

public static int OddIndexMax(int [] oddIndex) {

   int maximum = oddIndex[0];
	for (int i = 1; i < oddIndex.length; i = i +2) {

	if (oddIndex[i] > maximum) {
	   maximum = oddIndex[i];
	}
	}

	return maximum;
}

public static void SwapArray(int [] number) {
  int[] newArray = scanner.nextInt();
   }
}