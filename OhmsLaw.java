import java.util.Scanner;
public class OhmsLaw{
   public static void main(String[] args){
   
   int V, R;
   double I;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the voltage: ");
   V = input.nextInt();
   System.out.print("Enter the resistance: ");
   R = input.nextInt();
   I = (V + 0.0) / R; //a trick to do floating point division
   System.out.println("The voltage is " + V + " volts.");
   System.out.println("The resistance is " + R + " ohms.");
   System.out.println("The current is " + I + " amps.");
   
   }
}