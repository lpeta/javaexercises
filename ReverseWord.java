import java.util.Scanner;
public class ReverseWord{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Word to be reversed: ");
       String x = sc.next();
       String output = "";
       for (int j = x.length(); j > 0; j--) {
           output += x.charAt(j - 1);
        }
        System.out.println(output);
    }
}
