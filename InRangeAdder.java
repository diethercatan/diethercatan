import java.util.Scanner;

/* The program computes two sums; the sum of integers that are in the range (inclusive)
   and the sum of integers that are outside of the range */
public class InRangeAdder {
   public static void main(String[] args) {
      int lowEnd, highEnd, data, sumIn = 0, sumOut = 0;
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("In-range Adder");
      System.out.println("Low end of range: "); //asks the user for the low integer in a range of integers
      lowEnd = input.nextInt();
      
      System.out.println("High end of range: "); //asks the user for the high integer in a range of integers
      highEnd = input.nextInt();
      
      System.out.println("Enter data: "); //asks the user for integers to be added up
      data = input.nextInt();
      
      while (data != 0) { //the user signals the end of input with a 0
         if (data >= lowEnd && data <= highEnd)
            sumIn += data;
         else
            sumOut += data;
      
         System.out.println("Enter data (enter 0 to end): ");
         data = input.nextInt();
      }
   
      System.out.println("\nSum of in range values: " + sumIn);
      System.out.println("Sum of out range values: " + sumOut);
   }
}