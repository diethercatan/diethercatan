//A new policy charging $4.00 for all tickets sold after 2200 (10 pm)
import java.text.*;
import java.util.Scanner;
public class MidnightMadness{
   public static void main(String[] args){
   int customerAge, customerTime, adultMatinee = 5, normalAdult = 8, childMatinee = 2, normalChild = 4, charge = 4;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter customer's age: "); //asks for the customer's age
   customerAge = input.nextInt();
   
   System.out.print("Enter time: "); //asks for the time on a 24-hour clock (where noon is 1200 and 4:30 pm is 1630)
   customerTime = input.nextInt();
   
   DecimalFormat priceForm = new DecimalFormat("$0.00");
   
   if (customerAge > 13)
      if (customerTime < 1700) //a matinee starts at any time earlier than 5 pm (1700)  
         System.out.println("Adult Matinee Price: " + priceForm.format(adultMatinee)); //adult matinee price is $5.00
      else 
         if (customerTime > 2200){ //charging $4.00 for all tickets sold after 2200 (10 pm)
            System.out.println("Normal Adult Ticket Price: " + priceForm.format(normalAdult));
            System.out.println("                   Charge: " + priceForm.format(charge));
            System.out.println("              Total Price: " + priceForm.format(normalAdult+=charge));
         }
         else
            System.out.println("Normal Adult Ticket Price: " + priceForm.format(normalAdult)); //normal adult ticket price is $8.00
   else
      if (customerTime < 1700) //a matinee starts at any time earlier than 5 pm (1700)
         System.out.println("Children's Matinee Price: " + priceForm.format(childMatinee)); //children's matinee price is $2.00
      else
         System.out.println("Normal Children's Ticket Price: " + priceForm.format(normalChild)); //normal children's ticket price is $4.00
   
   }
}