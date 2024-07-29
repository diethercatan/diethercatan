/*
public class MainThread extends Thread {
   public static int amount = 0;
   
   public static void main(String[] args) {
      MainThread thread = new MainThread();
      thread.start();
      
      while(thread.isAlive()) 
         System.out.println("Waiting...");
      
      System.out.println("Main: " + amount);
      amount++;
      System.out.println("Main: " + amount);
   }
   
   public void run(){
      amount++;
   }
} */

/* 
public class MainThread implements Runnable {
   public static int amount = 0;
   
   public static void main(String[] args) {
      MainThread obj = new MainThread();
      Thread thread = new Thread(obj);
      thread.start();
      
      while(thread.isAlive()) 
         System.out.println("Waiting...");
      
      System.out.println("Main: " + amount);
      amount++;
      System.out.println("Main: " + amount);
   }
   
   public void run(){
      amount++;
   }
} */

/*
import java.util.ArrayList;
import java.util.function.Consumer;

public class MainThread {
   public static void main(String[] args) {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      nums.add(1);
      nums.add(2);
      nums.add(3);
      Consumer<Integer> method = (n) -> { System.out.println(n); };
      nums.forEach(method);
   }
} */

/*
interface StringFunction {
  String run(String str);
}

public class MainThread {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
} */

import java.util.*;

interface LastName {
   String write(String fname, String lname);
}

public class MainThread {
   public static void main(String[] args) {
      ArrayList<String> children = new ArrayList<String>();
      Scanner input = new Scanner(System.in);
            
      System.out.print("What is your last name? ");
      String lastNm = input.nextLine(); 
      
      System.out.print("How many children do you have? ");
      int childrenCnt = input.nextInt();
            
      if (childrenCnt == 0)
         System.out.println("No Children!");
      else {
         System.out.println();
         
         for (int count = 1 ; childrenCnt >= count ; count++) {
            System.out.print("Enter the name of your no." + count + " child: ");
            String childrenNm = input.next();
         
            LastName fullName = (f, l) -> f.concat(" " + l);
            children.add(writefn(childrenNm, lastNm, fullName));
         } 
      }
     
      System.out.println("\nCHILDREN: ");
      for (String fn : children)
         System.out.println(fn);
      
      System.out.println("\nCHILDREN: (Alphabetical order)");
      Collections.sort(children);     
      
      for (String fn : children)
         System.out.println(fn);
   }       
      
   public static String writefn(String firstn, String lastn, LastName fulln) {
      return fulln.write(firstn, lastn);
   }
}