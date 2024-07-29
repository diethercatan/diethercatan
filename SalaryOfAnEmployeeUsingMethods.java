import java.util.Scanner;
import java.text.DecimalFormat;

public class SalaryOfAnEmployeeUsingMethods {
   public static void main(String[] args) {
      double numOfWorkedHrs, ratePerHr, monthlyGrossPay, annualGrossPay, incomeTax, annualNetPay;
      String cont;

      do {
         numOfWorkedHrs = getWorkedHrs();
         ratePerHr = getRatePerHr();
         
         monthlyGrossPay = computeMonthlyGross(numOfWorkedHrs, ratePerHr);
         annualGrossPay = computeAnnualGross(monthlyGrossPay);
         incomeTax = computeIncomeTax(annualGrossPay);
         annualNetPay = computeAnnualNet(annualGrossPay, incomeTax);
         
         displayResults(monthlyGrossPay, annualGrossPay, incomeTax, annualNetPay);
         
         cont = asksContinue();

      } while (cont.equals("Y"));
   }

   public static double getWorkedHrs() {
      Scanner input = new Scanner(System.in);
      
      System.out.print("\nEnter number of hours worked : ");
      return input.nextDouble();
   }

   public static double getRatePerHr() {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter rate per hour : ");
      return input.nextDouble();
   }

   public static double computeMonthlyGross(double wrkdHrs, double ratePerHr) {
      return wrkdHrs * ratePerHr;
   }

   public static double computeAnnualGross(double monthlyGross) {
      return monthlyGross * 12;
   }

   public static double computeIncomeTax(double annualGross) {
      double taxRate, addTax = 0;
      
      if (annualGross <= 250000)
         taxRate = 0.0;
      else if (annualGross > 250000 && annualGross <= 400000)
         taxRate = 0.15;
      else if (annualGross > 400000 && annualGross <= 800000) {
         addTax = 22500;
         taxRate = 0.20;
      }
      else if (annualGross > 800000 && annualGross <= 2000000) {
         addTax = 102500 ;
         taxRate = 0.25;
      }
      else if (annualGross > 2000000 && annualGross <= 8000000) {
         addTax = 402500;
         taxRate = 0.30;
      }
      else {
         addTax = 2202500;
         taxRate = 0.35;
      }

      return (annualGross * taxRate) + addTax;
   }

   public static double computeAnnualNet(double annualGross, double incomeTax) {
      return annualGross - incomeTax;
   }

   public static void displayResults(double monthlyGross, double annualGross, double incomeTax, double annualNet) {
      DecimalFormat numForm = new DecimalFormat();
   
      System.out.println("Monthly Gross Pay : " + numForm.format(monthlyGross));
      System.out.println("Annual Gross Pay : " + numForm.format(annualGross));
      System.out.println("Income Tax : " + numForm.format(incomeTax));
      System.out.println("Annual Net Pay : " + numForm.format(annualNet));
   }

   public static String asksContinue() {
      Scanner input = new Scanner(System.in);
      
      System.out.println("\nDo you want to continue: (Y or N)");
      return input.nextLine();
   }
}