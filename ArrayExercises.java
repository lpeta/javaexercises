import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercises {
  public static void main(String[] args) {
    final int SIZE = 5;
    int[] anArray = new int[5];
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < SIZE; i++) {
      System.out.println("Please enter " + (i + 1) + " values for the Array ");
      anArray [i] = sc.nextInt();
    }

    System.out.println(Arrays.toString(anArray));
    System.out.println(Arrays.toString(reverseArray(anArray)));
    System.out.println(Arrays.toString(reverseArray2(anArray)));
    System.out.println(arraySum(anArray));
    System.out.println(altSum(anArray));
  }

  public static int[] reverseArray(int[] data) {

    int[] output = new int[data.length];

    for(int i = 0; i < data.length; i++) {
      output[i] = data[data.length - 1 - i];
    }

    return output;
  }

  public static int[] reverseArray2(int[] data) {

    for(int i = 0; i < data.length / 2; i++) {
       int temp = data[i];

       data[i] = data[data.length - 1 - i];
       data[data.length - 1 - i] = temp;
    }

    return data;
  }

  public static int arraySum(int[] data) {
    int output = 0;

    for(int i = 0; i < data.length; i++) {
       output += data[i];
    }

    return output;
  }

  public static int altSum(int[] data) {
    int output = 0;

    for(int i = 0; i < data.length; i++) {
      if(data[i] % 2 == 0) {
        output += data[i];
      }
      else {
        output -= data[i];
      }
    }

    return output;
  }
}