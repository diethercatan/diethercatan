import java.util.Scanner;

//A program that writes a wedge of stars
public class WedgeOfStars {
   public static void main(String[] args) {
      int starsNum;

      Scanner input = new Scanner(System.in);

      System.out.println("Initial number of stars: "); //the user enters the initial number of stars
      starsNum = input.nextInt();
      System.out.println();

      int num1 = starsNum, num2;
      
      //Writes out lines of stars
      while (num1 > 0) { //each line has one few star than the previous line
         num2 = num1;
         
         while (num2 > 0) {
            System.out.print("*");
            num2--;
         }
         
         System.out.println();
         num1--;
      }
   }
}