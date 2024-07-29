import java.util.Scanner;
import java.text.DecimalFormat;
public class CreditCardBill {
   public static void main(String[] args) {
      double monthlyPay, totalPay, bal, interst, interstCost;
      int month = 1;
      
      Scanner input = new Scanner(System.in);
      DecimalFormat numForm = new DecimalFormat();
      
      System.out.println("Enter the beginning balance: ");
      bal = input.nextDouble();
      
      System.out.println("Enter the monthly interest: "); 
      
      interst = input.nextDouble();
      
      System.out.println("Enter the monthly payment: ");
      monthlyPay = input.nextDouble();
 
      totalPay = monthlyPay;
      
      while (bal > 0) {  
         interstCost = bal / 100 * interst;
         bal = bal - monthlyPay + interstCost;
      
         System.out.print("\nMonth: " + month++);
         
         if (month < 11)
            System.out.print("\t\t\tbalance: " + numForm.format(bal));
         else
            System.out.print("\t\tbalance: " + numForm.format(bal));
            
         System.out.print("\t\t\ttotal payments: " + totalPay);  
         
         totalPay+=monthlyPay;
      }
   }
}