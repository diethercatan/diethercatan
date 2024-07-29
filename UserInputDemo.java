//Practice sa 'ta
import java.util.*;

class UserInputDemo{
public static void main(String[] args){  
Scanner sc= new Scanner(System.in);  
  
System.out.print("What is your name, bech? ");  
String name = sc.nextLine();  
System.out.print("How fcking old are you? ");  
int age = sc.nextInt();  
System.out.print("How many boyfriend did you have? ");  
int bf = sc.nextInt();  

System.out.println("\nYour Bitchy Personal Information!");
System.out.println("Full Name: "+name);  
System.out.println("Age: "+age);

if(bf==0){
System.out.println("Bech, How ugly are you?");
}
else{
System.out.println("Wow, how beautiful are you?");
}
}  
}  