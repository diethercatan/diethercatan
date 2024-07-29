import java.text.*;
import java.util.Scanner;
public class InternetDelicatessen{
   public static void main(String[] args){
	String itemName;
	double itemPrice, itemDelivery, totalPrice, regDelivery = 2, expDelivery = 3;
   
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the item: ");
	itemName = input.nextLine();

	System.out.print("Enter the price: ");
	itemPrice = input.nextDouble();

	System.out.print("Overnight delivery (0==no, 1==yes): ");
	itemDelivery = input.nextInt();


	if (itemDelivery == 1 && itemPrice < 10){
	   itemDelivery = expDelivery + regDelivery;
		totalPrice = itemPrice + itemDelivery;
   }	  	
   else if (itemDelivery == 1 && itemPrice >= 10){
	   itemDelivery = expDelivery;
		totalPrice = itemPrice + itemDelivery;
   }
   else if (itemDelivery == 0 && itemPrice < 10){
	   itemDelivery = regDelivery;
      totalPrice = itemPrice + itemDelivery;
   }
   else{
      itemDelivery = 0.00;
      totalPrice = itemPrice;
   }
   
   DecimalFormat numForm = new DecimalFormat("0.00");
   
   System.out.println("\nInvoice:");
   System.out.println("\t" + itemName + "  " + numForm.format(itemPrice));
   System.out.println("\tdelivery    " + numForm.format(itemDelivery));
   System.out.println("\ttotal       " + numForm.format(totalPrice));
   
   }
}