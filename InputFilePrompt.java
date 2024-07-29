import java.util.Scanner;

//This program just gather the file name
//Use methods of the String class to manipulate the user's input
//File names consist of two parts, a name and an extension
public class InputFilePrompt {
   public static void main(String[] args) {
      String fileName;
      final String fileExtension = ".dat";
      int error;
   
      Scanner input = new Scanner(System.in);
   
      do {
      //Asks the user for the name of the input file to be read by the program
         System.out.print("input file: ");
         fileName = input.nextLine().trim();
         String extension = fileName.substring(fileName.length()-4);
         error = 0;
                              
         //The file name must be in the correct format                     
         if (fileName.equals(fileExtension)) { 
            System.out.println(">>>file name missing<<<");
            error++;
         }
         
         //The extension must be ".dat" (for "data")
         if (!extension.equals(fileExtension)) {
            System.out.println(">>>file name must end with .dat<<<");
            error++;
         }
   
         //The name must not contain spaces
         for (int num = 1 ; num < fileName.length() ; num++) {
            if (fileName.charAt(num) == ' ') {   
               System.out.println(">>>file name must not contain spaces<<<");
               error++;
            }
         }
      
      //The user is repeatedly asked for a file name until it meets the requirement   
      }  while (error != 0);
      
      System.out.println("OK");
   }
}