/* class exception{ //Unchecked or Runtime Exception
public static void main(String args[]){
try{
int a=30,b=0,c;
c=a/b;
System.out.println("The result is "+c);
}
catch(ArithmeticException e){ //ArithmeticException
System.out.println("The a can't be divided by b!");
}
}
} */

/*
import java.io.FileReader; //Checked or Compile time Exception
import java.io.IOException;
class exception{
public static void main(String args[]){
try(FileReader fr = new FileReader("E:\\My.txt")){
char[] a = new char[50];
fr.read(a);
for(char c:a)
System.out.println(c);
}
catch(IOException e){ //IOException
e.printStackTrace();
}
}
} */



