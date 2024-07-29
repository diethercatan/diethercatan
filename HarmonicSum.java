import java.util.Scanner;

//A program that computes the following sum
public class HarmonicSum {
   public static void main(String[] args) {
      int numInput, num = 1; //an integer limit that the user enters
      double sum = 0;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter N: ");
      numInput = input.nextInt();

      //Use an integer variable for the loop counter
      while (num <= numInput) {
         sum += 1.0/num; //do the math using double precision
         num++;
      }

      System.out.println("\nSum is: " + sum);

   }
}