import java.util.Scanner;

//Sum all the integers (inclusive) between 1 and N
//Modify your program so that it calculates the sum both ways
/* You might worry that the formula will lead to integer division problems.
   But it works as is. Why? (Hint: think about even and odd.) */
//The sum of sequential integers 1 to N is called a triangle number import java.util.Scanner;
public class SumOfSequentialIntegers {
   public static void main(String[] args) {
      int num, n = 0, sumLoop = 0, sumFormula;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter N: "); //asks the user for N
      num = input.nextInt();

      //Another way to calculate the same thing is through a formula
      sumFormula = (num*(num+1))/2;

      /* Do this in a loop that counts up 1 to N and in
         each iteration adds the current count to the sum */
      while (n <= num) {
         sumLoop+=n;
         n++;
      }

      System.out.println("Loop Sum = " + sumLoop);
      System.out.println("Formula Sum = " + sumFormula);

   }
}