public class StringLength{ //StringDemo2
   public static void main(String[] args){
   
   String str;
   int len;
   
   //str = new String("Elementary, My Dear Watson!"); length: 27
   //str = new String("   \"Elementary , My Dear Watson!\""); length: 33
   //str = new String("MMMMMM"); length: 6 
   str = new String("iiiiii"); //the same as the length of "MMMMMM"
   len = str.length(); //the length is the number of characters
   System.out.println("The length is: " + len);
   
   }
}