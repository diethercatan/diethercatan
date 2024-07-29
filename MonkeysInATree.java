public class MonkeysInATree {
   public static void main(String[] args) {
      String count;
 
      for (int monkeys = 5 ; monkeys >= 0 ; monkeys--) {  
         if (monkeys == 5)
            count = "Five ";
         else if (monkeys == 4)
            count = "Four ";
         else if (monkeys == 3)
            count = "Three ";
         else if (monkeys == 2)
            count = "Two ";
         else if (monkeys == 1) 
            count = "One ";
         else
            count = "No "; 
         
         if (monkeys != 0) {
            System.out.println("\n" + count + "little monkeys swinging in a tree"); 
            System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
            System.out.println("Along came the crocodile as quiet as can be");
            System.out.println("and SNAP!");
         }
         else {
            System.out.println("\n" + count + "little monkeys swinging in a tree");
            System.out.println(count + "little monkeys swinging in a tree");
         }  
      }
   }
}