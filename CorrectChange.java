import java.util.Scanner;
public class CorrectChange{
   public static void main(String[] args){
   
   int change, dollars, quarters, dimes, nickels, cents;
   Scanner input = new Scanner(System.in);
   System.out.print("How much change is due? ");
   change = input.nextInt(); //change
   dollars = change / 100; //for dollars
   quarters = change % 100 / 25; //for quarters
   dimes = change % 100 % 25 / 10; //for dimes
   nickels = change % 100 % 25 % 10 / 5; //for nickels
   cents = change % 100 % 25 % 10 % 5; //for cents left
   
   if (change > 1)
      System.out.println("Change: " + change + " cents");
   else
      System.out.println("Change: " + change + " cent");

   System.out.print("Your change is: ");
   if (dollars > 0){
      if (dollars > 1)
      System.out.print(dollars + " dollars, ");
      else
      System.out.print(dollars + " dollar, ");
      }
   if (quarters > 0){
      if (quarters > 1)
      System.out.print(quarters + " quarters, ");
      else
      System.out.print(quarters + " quarter, ");
      }
   if (dimes > 0){
      if (dimes > 1)
      System.out.print(dimes + " dimes, ");
      else
      System.out.print(dimes + " dime, ");
      }
   if (nickels > 0){
      if (nickels > 1)
      System.out.print(nickels + " nickels, ");
      else
      System.out.print(nickels + " nickel, ");
      }
   if (cents > 0){
      if (cents > 1)
      System.out.print(cents + " cents.");
      else
      System.out.print(cents + " cent.");
      }
   }
}