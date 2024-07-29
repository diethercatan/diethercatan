/*
public class SampleException {
   public static void main(String[] args) { 
      int[] myNumbers = {1, 2, 3};
           
      try {
         System.out.println(myNumbers[10]);
      } 
      catch (Exception e) {
         System.out.println("Something went wrong.");
      }
      finally {
         System.out.println(myNumbers[2]);
      }
   }
} */

/*
import java.util.ArrayList;

public class SampleException {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars.size());
    
    cars.remove("Volvo");
    System.out.println(cars);
    
    cars.set(0, "Volvo");
    System.out.println(cars);
    System.out.println(cars.get(0));
    
    cars.clear();
    System.out.println(cars);
       
    ArrayList<String> ages = new ArrayList<String>();
    ages.add("21");
    System.out.println(ages);
    
  }
} */

/*
import java.util.ArrayList;
import java.util.Collections;

public class SampleException {
   public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Mercedez-Benz");
      cars.add("Ford");
      cars.add("Mazda");
      
      Collections.sort(cars);
      
      
      for (int i = 0 ; i < cars.size() ; i++) 
         System.out.println(cars.get(i)); 
     
      for (String i : cars)
         System.out.println(i);
   
   }
} */

/*
import java.util.ArrayList;
import java.util.Collections;
import java.time.*;
import java.time.format.*;

public class SampleException {
   public static void main(String[] args) {
      ArrayList<Integer> ages = new ArrayList<Integer>();
    
      ages.add(10);
      ages.add(9);
      ages.add(8);
      ages.add(7);
      ages.add(6);
      ages.add(5);
      ages.add(4);
      ages.add(3);
      ages.add(2);
      ages.add(1);
      
      Collections.sort(ages);
      
      for (Integer num : ages)
         System.out.print(num + " ");
         
      LocalDate date = LocalDate.now();
      DateTimeFormatter myFormatd = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String formattedDate = date.format(myFormatd);
      System.out.println("\n" + formattedDate);
      
      LocalTime time = LocalTime.now();
      DateTimeFormatter myFormatt = DateTimeFormatter.ofPattern("HH:mm:ss");
      String formattedTime = time.format(myFormatt);
      System.out.println(formattedTime);
      
      LocalDateTime datetime = LocalDateTime.now();
      DateTimeFormatter myFormatdt = DateTimeFormatter.ofPattern("E, MMM dd yyyy, HH:mm:ss");
      String formattedDateTime = datetime.format(myFormatdt);
      System.out.println(formattedDateTime);
   }
} */

/*
import java.util.LinkedList;

public class SampleException {
   public static void main(String[] args) {
      LinkedList<String> names = new LinkedList<String>();
      
      names.add(" LOVE ");
      names.addFirst("Diether Catan");
      names.addLast("Brent Campos");
      
      System.out.println("Si " + names.getFirst() + " kay gwapa.");
      System.out.println("Si " + names.getLast() + " kay gwapo.");
      
      for (String i : names)
         System.out.print(i);
      
      System.out.println();
      
      names.removeFirst();
      names.removeLast();
      
      System.out.print("Silang duha kay nakakain");
      
      for (String i : names)
         System.out.print(i.trim());
   }
} */

/*
import java.util.HashMap;

public class SampleException {
   public static void main(String[] args) {
      HashMap<String, Integer> ageOfStudent = new HashMap<String, Integer>();
      
      ageOfStudent.put("Diether", 21);
      ageOfStudent.put("Brent", 20);
      ageOfStudent.put("Mari", 17);
   
      for(String i : ageOfStudent.keySet())
         System.out.println("The age of " + i + " is " + ageOfStudent.get(i) + " years old.");
   }
}

*/

import java.util.HashSet;
import java.util.Iterator;

public class SampleException {
   public static void main(String[] args) {
      HashSet<String> names = new HashSet<String>();
      names.add("Diether ");
      names.add(" Delapena ");
      names.add(" Catan");
      
      /*
      if (names.contains("Diether")) {
         for (String i : names)
            System.out.println(i);
      }
      else {
         names.add("Diether");
         
         for (String i : names)
            System.out.println(i);
      } */
      
      Iterator<String> it = names.iterator();
      
      while(it.hasNext()) {
         String name = it.next().trim();
         if (name.equals("Delapena"))
            it.remove();
     }
     
     for (String i : names)
      System.out.print(i);
   }
}