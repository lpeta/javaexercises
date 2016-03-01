import java.util.Scanner;

public class Fibonacci
{
    public static void main(String [] args){
       
       Scanner sc = new Scanner(System.in);      
       System.out.print("Enter number to get Fibonacci: ");
       int userImput = sc.nextInt();
       
       int fold1 = 0;
       int fold2 = 1;
       int fnew = 0;
       
       for(int i = 0; i < userImput; i++) {
           
           System.out.println(fnew);
           
           fold1 = fold2;
           fold2 = fnew;
           fnew = fold1 + fold2;
           
        }
        
        
          
    }
   
    
}
