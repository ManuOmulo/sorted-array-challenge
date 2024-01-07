import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

  public static int[] getIntegers(int size) {
    int counter = 0;
    int[] intArray = new int[size];
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter %d numbers: %n", size);

    while (counter < size) {
      String input = sc.nextLine();
      int number = Integer.parseInt(input);
      intArray[counter] = number;
      counter += 1;
    }

    return intArray;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("Element %d contents %d %n", i, array[i]);
    }
  }

  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);

    Arrays.sort(sortedArray);

    for (int i = 0; i < sortedArray.length; i++) {
      for (int j = 1; j < sortedArray.length; j++) {
        if (j > i) {
          int temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }

    return sortedArray;
  }
}
