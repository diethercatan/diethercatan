import java.util.Scanner;

public class Payroll {
   public static void main(String[] args) {
      double rate, hrswkd, otHrs, tax, gross, otPay, netPay;
      String cont;
       
      do {
         hrswkd = getHrswkd();
         rate = getRate();
         otHrs = getOThrs();
         
         otPay = computeOTPay(otHrs, rate);
         gross = computeGPay(hrswkd, rate, otPay);
         tax = computeTax(gross);
         netPay = computeNetPay(gross, tax);
      
         displayResults(gross, otPay, tax, netPay);
         
         cont = asksCont();
         
      } while (cont.equals("Y"));
   }

   public static double getHrswkd() {
      double hrswkd;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("\nEnter no. of hours worked : ");
      hrswkd = scan.nextDouble();
      return hrswkd; 
   }
   
   public static double getRate() {
      double rate;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter rate per hour : ");
      rate = scan.nextDouble();
      return rate; 
   }
   
   public static double getOThrs() {
      double otHrs;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter no. of hours worked in overtime : ");
      otHrs = scan.nextDouble();
      return otHrs; 
   }
   
   public static double computeGPay(double r, double h, double otPay) {
      double gross;
      gross = r * h + otPay;
      return gross;
   }
   
   public static double computeOTPay(double otHrs, double r) {
      double otPay;
      otPay = 1.5 * r * otHrs;
      return otPay;
   }
   
   public static double computeTax(double g) {
      double tax, addTax = 0;
      
      if (g <= 250000)
         tax = 0.0;
      else if (g > 250000 && g <= 400000)
         tax = 0.15;
      else if (g > 400000 && g <= 800000) {
         addTax = 22500;
         tax = 0.20;
      }
      else if (g > 800000 && g <= 2000000) {
         addTax = 102500 ;
         tax = 0.25;
      }
      else if (g > 2000000 && g <= 8000000) {
         addTax = 402500;
         tax = 0.30;
      }
      else {
         addTax = 2202500;
         tax = 0.35;
      }
      tax = g * tax + addTax;
      return tax;
   }
   
   public static double computeNetPay(double g, double t) {
      double netPay;
      netPay = g - t;
      return netPay; 
   }
   
   public static void displayResults(double g, double ot, double t, double n) {
      System.out.println("Gross Pay : " + g);
      System.out.println("Overtime Pay : " + ot);
      System.out.println("Income Tax : " + t);
      System.out.println("Net Pay : " + n);
   }
   
   public static String asksCont() {
      String cont;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("\nDo you want to continue: (Y or N)");
      cont = scan.nextLine();
      return cont;
   }
}

