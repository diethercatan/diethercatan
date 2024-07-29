import java.util.Scanner;
public class SubString{
   public static void main(String[] args){
   
   String origString, subString;
   int beginIndex, endIndex;
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a string: ");
   origString = input.nextLine(); //for original string
   System.out.print("Enter beginning index: ");
   beginIndex = input.nextInt(); //for begin index
   System.out.print("Enter ending index: ");
   endIndex = input.nextInt(); //for end index
   subString = origString.substring(beginIndex,endIndex); //for substring
   System.out.println();
   System.out.println("Original string: ");
   System.out.println(origString);
   System.out.println();
   System.out.println("Substring: ");
   System.out.println(subString);
   
   }
}