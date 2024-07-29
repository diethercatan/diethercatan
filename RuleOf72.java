import java.text.*;
import java.util.Scanner;
public class RuleOf72{ 
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   double t;
   int r;
   System.out.print("Interest rate: ");
   r = input.nextInt();
   t = 72.0/r;
   
   DecimalFormat yearFormat = new DecimalFormat("0.0");
   System.out.print("With " + r + "% interest it takes about " + yearFormat.format(t)); 
   if(t>1.0)
   System.out.println(" years.");
   else
   System.out.println(" year.");
   
   }
}