import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = SortedArray.getIntegers(10);
    SortedArray.printArray(arr);
    System.out.println(Arrays.toString(SortedArray.sortIntegers(arr)));
  }
}
