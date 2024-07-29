import java.util.Scanner;
public class AnnualApplianceCost{
   public static void main(String[] args){
  
      Scanner input = new Scanner(System.in);
      double costperkWh, annualcost;
      int kWhusedperyear;

      System.out.println("Enter cost per kilowatt-hour in cents: ");
      costperkWh = input.nextDouble();
      System.out.println("Enter kilowatt-hours used per year: ");
      kWhusedperyear = input.nextInt();
   
      annualcost = costperkWh * kWhusedperyear;
   
      System.out.print("Annual cost: " + annualcost);
   }
}