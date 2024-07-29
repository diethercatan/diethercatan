import java.util.*;

public class DataStructures {
   public static void main(String[] args) {
      ArrayList<String> students = new ArrayList<String>();

      students.add("Diether");
      students.add("Delapina");
      students.add("Catan");
      
      Iterator<String> it = students.iterator();
      
      while (it.hasNext())
         System.out.print(" " + it.next());
   }
}