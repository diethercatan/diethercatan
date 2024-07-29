import java.text.DecimalFormat;
public class DrugPotency {
   public static void main(String[] args) {
      double loosePercnt = 0.04, effectivnssFull = 100, effectivnssHalf = 50;
      int month = 0;
   
      DecimalFormat numForm = new DecimalFormat();
   
      System.out.print("\nMonth: " + month);
      System.out.print("\t\t\teffectiveness: " + numForm.format(effectivnssFull));
      
      while (effectivnssFull > effectivnssHalf) { 
         effectivnssFull -= effectivnssFull * loosePercnt;
             
         System.out.print("\nMonth: " + ++month);
         
         if (month < 10) 
            System.out.print("\t\t\teffectiveness: " + numForm.format(effectivnssFull));
         else
            System.out.print("\t\teffectiveness: " + numForm.format(effectivnssFull));
      }
      
      System.out.print(" DISCARDED");
   }
}