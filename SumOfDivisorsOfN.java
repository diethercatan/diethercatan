import java.util.Scanner;

public class SumOfDivisorsOfN {
   public static void main(String[] args) {
      int N, sum = 0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer N: ");
      N = input.nextInt();
     
      System.out.print("\nThe divisors are: ");
      
      for (int num = 1 ; num < N ; num++) {
         if (N % num == 0) {
            System.out.print(num + " ");
            sum += num;
         }
      }
      
      System.out.print("\nThe sum of divisors is: ");
      
      if (N == sum)
         System.out.println(sum + " is a perfect number.");
      else
         System.out.println(sum + " is NOT a perfect number.");
   }
}