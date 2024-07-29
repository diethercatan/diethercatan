import java.util.Scanner;

public class countNumbers{
public static void main(String args[]){

System.out.println("Enter a string: ");
Scanner input=new Scanner(System.in);
int str=input.nextInt();

int sum=0;
for(int i=0;i<str.length();i++){
if(Character.isDigit(str.charAt(i)))
sum=sum+Character.getNumericalValue(str.charAt(i));
}
System.out.println("Sum of all the digit present in String: "+sum);
System.out.println("No. of Numbers: "+count);
}
}
