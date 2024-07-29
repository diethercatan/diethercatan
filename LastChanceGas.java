//A program to help drivers decide if they need gas
//Use integers for all input and all arithmetic
import java.util.Scanner;
public class LastChanceGas{
   public static void main(String[] args){
   int gasTank, gasGauge, milesGallon, gasLeft, milesLeft;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Tank capacity: "); //asks for the capacity of the gas tank in gallons
   gasTank = input.nextInt();
   
   System.out.println("Gage reading: "); //asks for the indication of the gas gauge in percent
   gasGauge = input.nextInt();
   
   System.out.println("Miles per gallon: "); //asks for the miles per gallon of the car
   milesGallon = input.nextInt();
   
   gasLeft = (gasTank * gasGauge) / 100;
   milesLeft = gasLeft * milesGallon;
   
   if (milesLeft < 200) //program then writes out "Get Gas!" 
      System.out.println("Get Gas!");  
   else //program then writes out "Safe to Proceed." 
      System.out.println("Safe to Proceed."); 
   
   }
}