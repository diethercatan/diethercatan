import java.util.Scanner;

public class IsAnIntegerTheSumOfTwoSquares {
   public static void main(String[] args) {
      int N, sqrs = 0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer N: ");
      N = input.nextInt();
      
      System.out.print("\n" + N);
      
      for (int a = 0 ; a*a < N ; a++) {
         for (int b = N ; b > a ; b--) {
            if (a*a + b*b == N) {
               System.out.print(" = " + a + "^2 + " + b + "^2");
               sqrs++;  
            }
         }
      }
      
      if (sqrs == 0)
         System.out.println(" is NOT a sum of two squares.");            
   }
}