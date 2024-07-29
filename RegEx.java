/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Catan", Pattern.LITERAL);
    Matcher matcher = pattern.matcher("Gwapa si Diether Catan!");
    boolean matchFound = matcher.find();
    
    if(matchFound) 
      System.out.println("Match found"); 
    else 
      System.out.println("Match not found");
  }
} */

import java.util.regex.*;
import java.util.Scanner;

public class RegEx {
   public static void main(String[] args) {
      Pattern pattern = Pattern.compile("porn|scandal|fuck|sex", Pattern.CASE_INSENSITIVE);
      
      Scanner input = new Scanner(System.in);
      System.out.print("Search: ");
      
      Matcher matcher = pattern.matcher(input.nextLine());
      boolean matchFind = matcher.find();
      
      if (matchFind)
         System.out.println("Manyak ka!!!");
      else
         System.out.println("Searching...");
   }
}