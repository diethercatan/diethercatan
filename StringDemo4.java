public class StringDemo4{
   public static void main(String[] args){
   
   String str = new String("Golf is a good walk spoiled."); //create the original object
   String sub = str.substring(8,19); //create a new object from the original
   //Output: "a good walk"
   //substring(int beginIndex, int endIndex)
   //String sub = str.substring(8,8); empty value
   //String sub = str.substring(0,28); 
   //String sub = str.substring(0,str.length());
   //String sub = str.substring(0,29); begin 0, end 29, length 28
   //String sub = str.substring(-1,str.length()); begin -1, end 28, length 28
   //String sub = str.substring(28,0); begin 28, end 0, length 28
   //both parameters must be in the range 0 to str.length()
   //first paramater must be less than or equal to the second parameter
   System.out.println(sub);
   
   }
}