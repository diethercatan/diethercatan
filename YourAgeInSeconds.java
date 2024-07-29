//Assume that there are 365 days per year (ignore leap years)
//Correctly take account of the different number of days in different months
import java.util.Scanner;
public class YourAgeInSeconds{
   public static void main(String[] args){
   int years, months, days;
   double seconds, percentage, humanLifespan = 25000000;
    
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter years: "); //asks for your age in years
   years = input.nextInt();
   
   System.out.print("Enter months: "); //asks for your age in months
   months = input.nextInt();
   
   System.out.print("Enter days: "); //asks for your age in days
   days = input.nextInt();
    
   if (months == 1)
      months = 31;
   else if (months == 2)
      months = 31 + 28;
   else if (months == 3)
      months = 31 + 28 + 31;
   else if (months == 4)
      months = 31 + 28 + 31 + 30; 
   else if (months == 5)
      months = 31 + 28 + 31 + 30 + 31;  
   else if (months == 6)
      months = 31 + 28 + 31 + 30 + 31 + 30;
   else if (months == 7)
      months = 31 + 28 + 31 + 30 + 31 + 30 + 31;
   else if (months == 8)
      months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
   else if (months == 9)
      months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
   else if (months == 10)
      months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
   else if (months == 11)
      months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
   else
      months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;

   days += months + (years*365); //calculating the number of total days you have been alive
   /* Multiply this by the number of hours per day (24), the number of minutes per hour (60), 
      and the number of seconds per minute (60) */
   seconds = 60 * 60 * 24 * days;
   percentage = (seconds/100/humanLifespan) * 100;
   
   System.out.println("Your age in seconds is " + seconds + "."); //writes out your age in seconds
   //Writes out what percentage of your expected lifespan you have lived
   System.out.println("The percentage of your expected lifespan you have lived is " + percentage + "%.");
   
   }
}