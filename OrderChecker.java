//The program checks the order
import java.util.Scanner;
public class OrderChecker{
   public static void main(String[] args){
   final int boltPrice = 5, nutPrice = 3, washerPrice = 1; //use constants for the unit cost of each item
   int boltNum, nutNum, washerNum;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Number of bolts: "); //asks the user for the number of bolts
   boltNum = input.nextInt();
   
   System.out.print("Number of nuts: "); //asks the user for the number of nuts
   nutNum = input.nextInt();

   System.out.print("Number of washers: "); //asks the user for the number of washers
   washerNum = input.nextInt();
   
   /* A correct order must have at least as many nuts as bolts and 
      at least twice as many washers as bolts, otherwise the order has 
      an error */
   
   if (nutNum != boltNum && washerNum != boltNum*2) 
      {
      System.out.println("\nCheck the Order: too few nuts"); //both error messages are written if the order has both errors
      System.out.println("Check the Order: too few washers");
      } 
   else if (nutNum != boltNum) //an error the program writes out "Check the Order: too few nuts"
      System.out.println("\nCheck the Order: too few nuts");
   else if (washerNum != boltNum*2) //an error the program writes out "Check the Order: too few washers" 
      System.out.println("\nCheck the Order: too few washers");
   else //no errors the program writes out "Order is OK."
      System.out.println("\nOrder is OK.");     
   
   //Total price in cents (of the specified number of items)
   System.out.println("\nTotal cost: " + ((boltNum*boltPrice) + (nutNum*nutPrice) + (washerNum*washerPrice))); 
   
   }
}