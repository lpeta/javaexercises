public class Power
{
   public static void main(String [] args){
       
       System.out.println("** - Using for loop - **");
       for (int x = 0; x <= 20; x++) {
           int result = 1;
           for (int i = 0; i < x; i++) {
                result *= 2;
           }
           System.out.println("2 to the power of " + result);
       }   
       
           System.out.println("** - Using math Pow method - **");
       
       for (int x = 0; x <= 20; x++) {

           System.out.println("2 to the power of " + x + " = " + (int) Math.pow(2, x));
           
        }
    }
}
