//Assume that the age will always be less than or equal to 100
import java.util.Scanner;
public class Y2KProblemDetector{
   public static void main(String[] args){
   int yearBirth, yearCurrent, age;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Year of Birth: "); //asks a user for their birth year encoded as two digits 
   yearBirth = input.nextInt();
   
   System.out.print("Current year: "); //asks a user for the current year
   yearCurrent = input.nextInt();
   
   if (yearBirth < yearCurrent) 
      age = yearCurrent - yearBirth;
   else
      {
      yearCurrent += 100;
      age = yearCurrent - yearBirth;
      }
      
   System.out.println("Your age: " + age); //writes out the users age in years
      
   }
}