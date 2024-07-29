public class StringDemo3{
   public static void main(String[] args){
   
   String str;
   str = new String("      In a Hole     in the ground there lived a Hobbit.    "); 
   //String second;
   //second = str.trim(); //trim off the spaces and tabs of the sides
   //System.out.println(second);
   //Output: "In a Hole     in the ground there lived a Hobbit."
   //internal extra spaces remain
   System.out.println(str.trim());
   
   }
}