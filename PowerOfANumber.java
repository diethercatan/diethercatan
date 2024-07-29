import java.util.Scanner;
import java.text.DecimalFormat;

//A program that computes X^N where X is a floating point number and N is a positive integer
/* Initialize the variable that will hold the result to 1. 
   Then multiply it by X once per loop iteration */
public class PowerOfANumber {
   public static void main(String[] args) {
      double X, value = 1;
      int N, num = 0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter X: ");
      X = input.nextDouble();
      
      System.out.println("Enter N: ");
      N = input.nextInt();
      
      DecimalFormat valueForm = new DecimalFormat("0.#####;-0.#####");
      
      if (N >= 0) {
         while (num < N ) {
            value*=X; 
            num++;
         }
         System.out.println("\n" + X + " raised to the power " + N + " is: " + valueForm.format(value));
      }
      else //informs the user that N must be positive if the user enters a negative value
         System.out.println("\nN must be a positive integer.");
   }   
}