import java.util.Scanner;

public class SqrtCalc {
  public static void main(String[] args) {
    String chars;
    double x;
    Scanner obj = new Scanner(System.in);
    
    do {
      do {
        System.out.println("Enter a number: ");
        x = obj.nextDouble();
      
        if(x<0)
          System.out.println(">>>number must be positive<<<");
        }
        while(x<0);
      chars = obj.nextLine();
      System.out.println("Square root of " + x + " is " + Math.sqrt(x));
      do { 
        System.out.print("Do you wish to continue? (yes or no) :");
        chars = obj.nextLine();
        
        if (!chars.contentEquals("yes") && !chars.contentEquals("no"))
          System.out.println(">>>Please respond with (yes or no)<<<");
      }
      while((!chars.contentEquals("yes")) && (!chars.contentEquals("no")));
    }
    while(chars.equals("yes"));
    System.out.println("bye");
  }
}