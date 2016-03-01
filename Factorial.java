import java.util.*;

    public class Factorial
    {   
        public static void main(String [ ] args){
            
        int counter = 0; 
        Scanner sc = new Scanner(System.in);      
        System.out.println("Enter a number:    ");
        counter = sc.nextInt();
        long factorial = counter;  
            while (counter > 1)  
               factorial *= --counter;
        
        System.out.println(factorial);  
             
     
    }
        
    
    
}
