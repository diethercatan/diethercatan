import java.text.*;
import java.util.Scanner;
public class ValueOfADeposit{ 
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   double V, r;
   int P, n, t;
   System.out.print("Initial deposit: ");
   P = input.nextInt();
   System.out.print("Interest rate: ");
   r = input.nextDouble();
   System.out.print("Times per year: ");
   n = input.nextInt();
   System.out.print("Number of years: ");   
   t = input.nextInt();
   V = P * Math.pow(1+(r/n),n*t);
   
   DecimalFormat valueFormat = new DecimalFormat("$0.00");
   System.out.println("Value: "+ valueFormat.format(V));
   
   }
}