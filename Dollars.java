import java.util.Scanner;
public class Dollars{
   public static void main(String[] args){
   
   int cents, dollars;
   Scanner input = new Scanner(System.in);
   System.out.print("Input the cents: ");
   cents = input.nextInt();
   dollars = cents / 100; //using only integer arithmetic
   cents = cents % 100;
   System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
   
   }
}