import java.util.Random;
public class RandomNames{
   public static void main(String[] args){
      int fnum, lnum; 
      String fname = null, lname = null;
   
      Random names = new Random();
   
      fnum = names.nextInt(10)+1;
      lnum = names.nextInt(10)+1;
   
      switch(fnum){
         case 1: fname = "Averill"; break; 
         case 2: fname = "Baldwin"; break; 
         case 3: fname = "Campbell"; break;
         case 4: fname = "Dune"; break;
         case 5: fname = "Echo"; break;
         case 6: fname = "Fifer"; break;
         case 7: fname = "Guthrie"; break; 
         case 8: fname = "Hero"; break;  
         case 9: fname = "Jagger"; break;
         case 10: fname = "Kit"; break;    
      }
   
      switch(lnum){
         case 1: lname = "Lewis"; break; 
         case 2: lname = "Mate"; break; 
         case 3: lname = "Pritt"; break;
         case 4: lname = "River"; break;
         case 5: lname = "Smith"; break;
         case 6: lname = "Timberton"; break;
         case 7: lname = "Vain"; break; 
         case 8: lname = "Wealth"; break;  
         case 9: lname = "Yen"; break;
         case 10: lname = "Zuckerberg"; break;    
      }
   
      System.out.println("Character's name: " + fname + " " + lname);
   
   }
}