//A program that asks for a contestant's weight and then says if the contestant is allowed in the contest
import java.util.Scanner;
public class PieEatingContest{
   public static void main(String[] args){
   int weight;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter a contestant's weight: ");
   weight = input.nextShort();
   
   //All contestants in the heavyweight division must weigh within 30 pounds of 250 pounds 
   if (weight >= 30 && weight <= 250) 
      System.out.println("The contestant is allowed in the contest.");
   else
      System.out.println("The contestant is not allowed in the contest.");
   
   }
}