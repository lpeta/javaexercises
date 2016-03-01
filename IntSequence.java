import java.util.Scanner;

public class IntSequence
{
  public static void main(String args [])
  {
    double div;

    int arg = -1;
    int min = 0;
    int max = 0;
    int num = -1;

    Scanner sc = new Scanner(System.in);

    while(arg != 0) {

      num++;

      System.out.println("Please enter a interger " + (num + 1) + ":");
      arg = sc.nextInt();

      if(max == 0  && min == 0) {
        max = arg;
        min = arg;
      }

      if(arg > max && arg != 0) {
        max = arg;
      }

      if(arg < min && arg != 0) {
        min = arg;
      }
    }

    div = ((double)max + (double)min) / (double)num;

    System.out.println("The number of values entered is: " + num);
    System.out.println("The largest value is: " + max);
    System.out.println("The smallest value is: " + min);
    System.out.println("The average of the values is: " + div);
    System.out.println("The range of the values is: " + (max - min));
  }
}
