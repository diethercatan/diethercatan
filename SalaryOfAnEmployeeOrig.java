import java.util.Scanner;
import java.text.DecimalFormat;

public class SalaryOfAnEmployeeOrig{
   public static void main(String[] args){
      double numOfWorkedHrs, ratePerHr, monthlyGrossPay, annualGrossPay, taxRate, addTax = 0, incomeTax;

      Scanner input = new Scanner(System.in);
      DecimalFormat numForm = new DecimalFormat();

      System.out.print("Enter number of hours worked: ");
      numOfWorkedHrs = input.nextDouble();

      System.out.print("Enter rate per hour : ");
      ratePerHr = input.nextDouble();

      monthlyGrossPay = numOfWorkedHrs * ratePerHr;
      annualGrossPay = monthlyGrossPay * 12;

      if (annualGrossPay <= 250000)
         taxRate = 0.0;
      else if (annualGrossPay > 250000 && annualGrossPay <= 400000)
         taxRate = 0.15;
      else if (annualGrossPay > 400000 && annualGrossPay <= 800000) {
         addTax = 22500;
         taxRate = 0.20;
      }
      else if (annualGrossPay > 800000 && annualGrossPay <= 2000000) {
         addTax = 102500 ;
         taxRate = 0.25;
      }
      else if (annualGrossPay > 2000000 && annualGrossPay <= 8000000) {
         addTax = 402500;
         taxRate = 0.30;
      }
      else {
         addTax = 2202500;
         taxRate = 0.35;
      }

      incomeTax = (annualGrossPay * taxRate) + addTax;
      
      System.out.println("Monthly Gross Pay : " + numForm.format(monthlyGrossPay));
      System.out.println("Annual Gross Pay : " + numForm.format(annualGrossPay));
      System.out.println("Income Tax : " + numForm.format(incomeTax));
      System.out.println("Annual Net Pay : " + numForm.format((annualGrossPay-incomeTax)));
   
   }
}