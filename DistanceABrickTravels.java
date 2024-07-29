import java.util.Scanner;
public class DistanceABrickTravels{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double t, d;
      System.out.print("Enter the number of seconds: ");
      
      t = input.nextDouble();
      d = (0.5)*32.174*t*2*2;
      
      System.out.print("Distance: " + d);
   }
}