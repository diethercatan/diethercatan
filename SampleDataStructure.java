import java.util.*; 
import java.io.*;

public class SampleDataStructure {
   public static void main(String[] args) {
      try {
         FileWriter writer = new FileWriter("ListOfStudents.txt");
         HashMap<String,String> studentList = new HashMap<String,String>();
         HashMap<Double,String> studentGrade = new HashMap<Double,String>();
         ArrayList<String> studentLastName = new ArrayList<String>();
         ArrayList<Double> aveGrade = new ArrayList<Double>();
         Scanner input = new Scanner(System.in);
        
         System.out.print("Number of Students: ");
         int numOfStds = input.nextInt();
         
         writer.write("Number of Students: " + numOfStds + "\n");
         
         for (int num = 1 ; num <= numOfStds ; num++) {
            System.out.println("\nStudent No." + num);
            
            System.out.print("First Name: ");
            String firstName = input.next().trim();
            System.out.print("Last Name: ");
            String lastName = input.next().trim();
            studentList.put(lastName,firstName);
            
            System.out.print("GPA: ");
            studentGrade.put(input.nextDouble(),lastName);
         } 
         
         for (String lname : studentList.keySet())
            studentLastName.add(lname);
         
         for (double ave : studentGrade.keySet())
            aveGrade.add(ave);
            
         Collections.sort(studentLastName);
         Collections.sort(aveGrade);
         
         writer.write("\nList of Students:\n");
           
         for (String lname : studentLastName) {
            writer.write(lname + ", " + studentList.get(lname));
            writer.write("\n");
         }
            
         writer.write("\nDean's Lister:\n");

         for (double ave : aveGrade) {
            if (ave <= 1.5) {
               writer.write(ave + " " + studentGrade.get(ave) + ", " + studentList.get(studentGrade.get(ave)));
               writer.write("\n");
            }
         }
         
         writer.close();
      } 
        
      catch (IOException e) {
         e.printStackTrace();
      }
   }
}