import java.io.*;
//import java.util.Scanner;

public class SampleFile {
   public static void main(String[] args) {
      try {
         File myText = new File("ListOfStudents.txt");
         //Scanner myScan = new Scanner(myText);
         if (myText.exists()) {
            System.out.println("The file is already created.");
            System.out.println("File Name: " + myText.getName());
            System.out.println("File Absolute Path: " + myText.getAbsolutePath());
            System.out.println("File Size: " + myText.length() + " bytes");
            System.out.println("Readable: " + myText.canRead());
            System.out.println("Writeable: " + myText.canWrite());
            
            /*
            while (myScan.hasNextLine()) 
               System.out.println(myScan.nextLine());
            */
         
            //myScan.close();
         }
         else
            System.out.println("The file is not yet created.");
      }
      
      catch (Exception e) {
         e.printStackTrace();
      }
   }
}