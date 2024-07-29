//Use integer arithmetic throughout the program
import java.util.Scanner;
public class DiscountPrices{
   public static void main(String[] args){
   int amountPurchases, discountedPrice;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter amount of purchases: "); //asks for the amount of a purchase
   amountPurchases = input.nextInt(); //purchase amount will be input in cents (as an integer)
   
   if (amountPurchases > 1000){ //a 10% discount is applied to purchases over $10.00
      discountedPrice = amountPurchases - (amountPurchases * 10 / 100); //calculates the discounted price 
      System.out.println("Discounted price: " + discountedPrice); 
   }
   else
      System.out.println("The price cannot be discounted."); 
      
   }
}