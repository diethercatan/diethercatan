import java.util.Scanner;

/* Improve the first version of the square root program of the chapter 
   by repeatedly prompting the user until the number that is entered is positive */
/* This program the main purpose, computing and printing the square root, 
   is easily done in a few statements */
/* The user interaction calls for some fairly complicated logic. 
   This imbalance is typical of user friendly programs */
public class ImprovedSquareRootProgram {
   public static void main(String[] args) {
      double number;
      String continueYN;
      
      Scanner input = new Scanner(System.in);
      
      //Inserting a nested do/while inside the loop body of the do/while      
      do {
         do {
            System.out.print("Enter a number--> ");
            number = input.nextDouble();
            
            if (number < 0)
               System.out.println(">>>number must be positive<<<");         
         
         }  while (number < 0);
         
         continueYN = input.nextLine().toLowerCase();
         
         System.out.println("Square root of " + number + " is " + Math.sqrt(number));
         
         do { //asks if the user wishes to continue
            System.out.print("Do you wish to continue (yes or no)? ");
            continueYN = input.nextLine().toLowerCase();
            
            if (!continueYN.equals("yes") && !continueYN.equals("no"))
               System.out.println(">>>Please respond with (yes or no)<<<");

         } while (!continueYN.equals("yes") && !continueYN.equals("no"));       
      
      //Improve program so that the user must respond exactly with "yes" or "no"    
      }  while (continueYN.equals("yes")); 
      
      System.out.println("Bye");
   }
}