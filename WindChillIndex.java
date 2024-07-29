//A program that calculates the wind chill index given the temperature and the wind speed
//Import java.lang.Math and use floating point input 
import java.util.Scanner;
import java.lang.Math;
public class WindChillIndex{
   public static void main(String[] args){
   double v, temp, windChill;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter Wind Speed: "); //asks for the wind speed v in miles per hour 
   v = input.nextDouble();
   
   System.out.println("Enter Temperature: "); //asks for the temperature temp in Fahrenheit
   temp = input.nextDouble();

   if (v < 3 || temp > 50)
      System.out.println("Wind Chill: " + temp);
   else{
      windChill = 35.74 + 0.6215*temp - 35.75*Math.pow(v,0.16) + 0.4275*temp*Math.pow(v,0.16); //to calculate v^0.16 use Math.pow()
      System.out.println("Wind Chill: " + windChill);
   }
   }
}