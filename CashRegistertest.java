import java.util.Scanner;

public class CashRegistertest 
{
    public static void main(String[ ] args) 
    {
        Scanner input = new Scanner(System.in);
        CashRegister reg1 = new CashRegister();
        System.out.print("Enter a price for first register: ");
        double price = input.nextDouble();
        reg1.addItem(price);
   
        System.out.print("Enter another price: ");
        price = input.nextDouble();
        reg1.addItem(price);
        System.out.printf("Total cost is £%5.2f", reg1.getTotal());
        System.out.println(" and number of items bought is " + reg1.getCount());
    
        /* write additional code to:
        (i) create the remaining two instances of CashRegister
        (ii) add a number of item prices in each of them  
        */
        CashRegister reg2 = new CashRegister(),
                     reg3 = new CashRegister();
        System.out.print("Enter a price for second register: ");
        price = input.nextDouble();
        reg2.addItem(price);
        System.out.printf("Total cost is £%5.2f", reg2.getTotal());
        System.out.println(" and number of items bought is " + reg2.getCount());
}

}  // end of class CashRegisterTest

