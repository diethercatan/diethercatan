import java.util.Scanner;

public class TownDump{
 public static void main(String[]args){
  
  int charges = 20 , addcharges = 8;
  
  Scanner scan = new Scanner(System.in);
 
  System.out.println("Enter the weight of a load of trash: ");
  int pounds = scan.nextInt();
  
  if (pounds <= 200)
      System.out.println("charges: " + charges);
  else {
      charges += (pounds - 200) / 100 * addcharges;
      System.out.println("charges: " + charges);
  }
  }
}