import java.util.Scanner;
public class CircleArea{
   public static void main(String[] args){
   
   int rad;
   double area;
   Scanner input = new Scanner(System.in);
   System.out.print("Input the radius: ");
   rad = input.nextInt();
   area = Math.PI*rad*rad; //calculates the area of a circle from its radius
   System.out.println("The radius is: " + rad);
   System.out.println("The area is: " + area);
   
   }
}