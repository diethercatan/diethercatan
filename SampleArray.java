import java.util.*;

public class SampleArray {
   static ArrayList<String> names = new ArrayList<String>();   
   static   {
      names.add("Diether");
      names.add("Marianne");
      names.add("Sophia");      
   }
   
   public static void printNames() {
      for (String str : names)
         System.out.println(str);
   }
}