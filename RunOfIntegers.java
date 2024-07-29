import java.util.Scanner;

public class RunOfIntegers {
   public static void main(String[] args) {
      int startValue, endValue;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter Start: "); //asks the user for a starting value
      startValue = input.nextInt();

      System.out.println("Enter End: "); //asks the user for an ending value
      endValue = input.nextInt();
      System.out.println("\n");

      //Writes all the integers (inclusive) between those two values
      while (startValue <= endValue) {
         System.out.println(startValue);
         startValue++;
      }
   }
}