//A program that determines the price of a movie ticket 
//Used nested if statements to determine the ticket price
import java.text.*;
import java.util.Scanner;
public class MatineeMovieTickets{
   public static void main(String[] args){
      int customerAge, customerTime, adultMatinee = 5, normalAdult = 8, childMatinee = 2, normalChild = 4;
   
      Scanner input = new Scanner(System.in);
   
      //Information gathering phase
      System.out.print("Enter customer's age: "); //asks for the customer's age
      customerAge = input.nextInt();
   
      System.out.print("Enter time: "); //asks for the time on a 24-hour clock (where noon is 1200 and 4:30 pm is 1630)
      customerTime = input.nextInt();
   
      DecimalFormat priceForm = new DecimalFormat("$0.00");
   
      //Processing phase
      if (customerAge > 13)
         if (customerTime < 1700) //a matinee starts at any time earlier than 5 pm (1700)
            System.out.println("Adult Matinee Price: " + priceForm.format(adultMatinee)); //adult matinee price is $5.00
         else
            System.out.println("Normal Adult Ticket Price: " + priceForm.format(normalAdult)); //normal adult ticket price is $8.00
      else
         if (customerTime < 1700) //a matinee starts at any time earlier than 5 pm (1700)
            System.out.println("Children's Matinee Price: " + priceForm.format(childMatinee)); //children's matinee price is $2.00
         else
            System.out.println("Normal Children's Ticket Price: " + priceForm.format(normalChild)); //normal children's ticket price is $4.00
      
   
   }
}