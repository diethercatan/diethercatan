import java.util.Scanner;

public class SimpleLinkedList0 {
   private int age;
   private SimpleLinkedList0 next;
   
   SimpleLinkedList0(int a) { age = a; next = null; }
   
   public int getAge() { return age; }
   public SimpleLinkedList0 getNext() { return next; }
   
   public void setAge(int a) { age = a; }
   public void setNext(SimpleLinkedList0 nxt) { next = nxt; }
   
   public String toString() { return age + ""; }
 
   public static void main(String[] args) {
      SimpleLinkedList0 age0 = new SimpleLinkedList0(2);
      SimpleLinkedList0 age1 = new SimpleLinkedList0(1); age0.setNext(age1);
      SimpleLinkedList0 age2 = new SimpleLinkedList0(4); age1.setNext(age2);
      SimpleLinkedList0 age3 = new SimpleLinkedList0(3); age2.setNext(age3);
      SimpleLinkedList0 age4 = new SimpleLinkedList0(5); age3.setNext(age4);
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number to search for: ");
      int target = input.nextInt();
      
      SimpleLinkedList0 p = age0;
      boolean found = false;
      //int sumOfEven = 0; - sum of evens
      //int sumOfOdd = 0; - sum of odds
      
      while (p != null && !found) {
         //if (p.getAge() % 2 == 0) - tests if it is even
            //sumOfEven += p.getAge(); - sum up the evens
         //if (p.getAge() % 2 == 1) - tests if it is odd
            //sumOfOdd += p.getAge(); - sum up the odds
            
         if (target == p.getAge()) found = true;
 
         p = p.getNext();
      }
      
      //System.out.println("Sum of Evens: " + sumOfEven);
      //System.out.println("Sum of Odds: " + sumOfOdd); // prints the sum
      
      if (found)
         System.out.println("The number " + target + " is found.");
      else
         System.out.println("The number " + target + " is not found.");
   }
}