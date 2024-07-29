//Assume that the two packages will not come out equal in value
import java.util.Scanner;
public class GroundBeefValueCalculator{
public static void main(String[] args){
   double poundPriceA, poundPriceB, valueA, valueB;
   int leanPercentA, leanPercentB;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Price per pound package A: "); //asks the user for the price per pound of package "A"
   poundPriceA = input.nextDouble();
   
   System.out.println("Percent lean package A: "); //asks the user for the percent lean in package "A"
   leanPercentA = input.nextInt();
   
   System.out.println("Price per pound package B: "); //asks the user for the price per pound of package "B"
   poundPriceB = input.nextDouble();
   
   System.out.println("Percent lean package B: "); //asks the user for the percent lean in package "B"
   leanPercentB = input.nextInt();

   //Calculates the cost per pound of lean (non-fat) beef for each package
   valueA = (poundPriceA*100) / leanPercentA;
   valueB = (poundPriceB*100) / leanPercentB;
   
   System.out.println("\nPackage A cost per pound of lean: " + valueA);
   System.out.println("Package B cost per pound of lean: " + valueB);
   
   if (valueA < valueB) //writes out which is the best value
      System.out.println("Package A is the best value.");
   else
      System.out.println("Package B is the best value.");

   }
}