import java.util.*;

public class SampleLinkedHashMap {
   public static void main (String[] args) {
      LinkedHashMap<Integer,String> data = new LinkedHashMap<Integer,String>();
      
      data.put(1,"Diether");
      data.put(2,"Delapina");
      data.put(3,"Catan");
      
      Set set = data.entrySet();
      Iterator it = set.iterator();
      
      while (it.hasNext()) {
         Map.Entry me = (Map.Entry) it.next();
         System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
      }
      /*
      for (int num : data.keySet())
         System.out.print(data.get(num));
      */
   }
}