import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercises {
  public static void main(String[] args) {
    final int SIZE = 5;
    int[] anArray = new int[5];

    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < SIZE; i++) {
      System.out.println("Please enter 5 values for the Array ");
      anArray [i] = sc.nextInt();

    }

    System.out.println(Arrays.toString(anArray));
    System.out.println(Arrays.toString(reverseArray(anArray)));
  }


  public static int[] reverseArray(int[] data) {
    int[] output = new int[data.length];
    for(int i = 0; i < data.length; i++) {
      output[i] = data[(data.length - 1) - i];
    }
    return output;
  }



  public static int[] reverseArray2(int[] data) {
    return data;

  }

  public static int[] arraySum(int[] data) {
    return data;


  }

  public static int[] altSum(int[] data) {
    return data;

  }


}