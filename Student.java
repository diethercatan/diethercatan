//ABSTRACTION
/*
abstract class Student{
abstract void introduction();
}
class Student1 extends Student{
public void introduction(){
System.out.println("Hello, I'm Natalie!");
}
}
class Student2 extends Student{
public void introduction(){
System.out.println("Hello, I'm Marianne!");
}
}
class checkStudent{
public static void main(String args[]){
Student a=new Student1();
Student b=new Student2();
a.introduction();
b.introduction();
introduction();
}
static void introduction(){
System.out.println("Hello, I'm Diether!");
}
} */


//PATTERN
/*
import java.util.*;
class Student{
public static void main(String args[]){
System.out.println("Enter a number: ");
Scanner num=new Scanner(System.in);
int number=num.nextInt();
//many to one
for(;number>0;--number){
System.out.print("\n");
int number1=number;
for(;number1>0;--number1){
System.out.print("*");
}
}  
//one to many
for(int i=0;i<number;++i){
System.out.print("\n");
for(int j=0;j<=i;++j){
System.out.print("*");
}
} 
}
} */

//ENCAPSULATION
/*
public class Student{
private String name;
private int age;
private String status;
public String getName(){
return name;
}
public int getAge(){
return age;
}
public String getStatus(){
return status;
}
public void setName(String name){
name=name;
}
public void setAge(int age){
age=age;
}
public void setStatus(String status){
status=status;
}
}
class Studentdetail{
public static void main(String args[]){
Student a=new Student();
a.setName("Diether Catan");
a.setAge(21);
a.setStatus("Single");
System.out.println("Name: "+a.getName()); //null
System.out.println("Age: "+a.getAge()); //0
System.out.println("Status: "+a.getStatus()); //null
}
} */

//METHOD OVERRIDING
/*
class Student{
public void intro(){
System.out.println("Hello, I'm Diether!");
}
}
class Student1 extends Student{
public void intro(){
System.out.println("Hello, I'm Mari!");
}
}
class testMethodOverriding{
public static void main(String args[]){
Student a=new Student();
Student b=new Student1();
a.intro();
b.intro();
}
} */

//METHOD OVERLOADING
/*
class Student{
void sum(int a,long b){
System.out.println("The first sum is "+(a+b)+".");
}
void sum(int a,int b,int c){
System.out.println("The second sum is "+(a+b+c)+".");
}
void difference(int a,long b){
System.out.println("The first difference is "+(a-b)+".");
}
void difference(int a,int b,int c){
System.out.println("The second difference is "+(a-b-c)+".");
} 
void product(int a,long b){
System.out.println("The first product is "+(a*b)+".");
}
void product(int a,int b,int c){
System.out.println("The second product is "+(a*b*c)+".");
}
void quotient(int a,long b){
System.out.println("The first quotient is "+(a/b)+".");
}
void quotient(int a,int b,int c){
System.out.println("The second quotient is "+(a/b/c)+".");
}
}
class checkSum{
public static void main(String args[]){
Student a=new Student();
a.sum(4,590); //594
a.sum(1,2,3); //6
a.difference(700,200); //500
a.difference(10,3,1); //6
a.product(5,100); //500
a.product(5,7,2); //70
a.quotient(10,2); //5
a.quotient(50,5,10); //1
}
} */
/*
import java.util.*;
class Student{
void sum(){
System.out.println("\n\tADDITION");
System.out.println("Enter the first number for sum: ");
Scanner num=new Scanner(System.in);
long a=num.nextInt();
System.out.println("Enter the second number for sum: ");
Scanner num1=new Scanner(System.in);
long b=num1.nextInt();
System.out.println("The sum is "+(a+b)+".");
}
void difference(){
System.out.println("\n\tSUBTRACTION");
System.out.println("Enter the subtrahend: ");
Scanner num=new Scanner(System.in);
long a=num.nextInt();
System.out.println("Enter the minuend: ");
Scanner num1=new Scanner(System.in);
long b=num1.nextInt();
System.out.println("The difference is "+(a-b)+".");
}
void product(){
System.out.println("\n\tMULTIPLICATION");
System.out.println("Enter the multiplicand: ");
Scanner num=new Scanner(System.in);
long a=num.nextInt();
System.out.println("Enter the multiplier: ");
Scanner num1=new Scanner(System.in);
long b=num1.nextInt();
System.out.println("The product is "+(a*b)+".");
}
void quotient(){
System.out.println("\n\tDIVISION");
System.out.println("Enter the dividend: ");
Scanner num=new Scanner(System.in);
long a=num.nextInt();
System.out.println("Enter the divisor: ");
Scanner num1=new Scanner(System.in);
long b=num1.nextInt();
System.out.println("The quotient is "+(a/b)+".");
System.out.println("The remainder is "+(a%b)+".");
}
}
class Result{
public static void main(String args[]){
Student a=new Student();
a.sum();
a.difference();
a.product();
a.quotient();
}
} */

//STATIC
/*
class Student{ 
public static int Interest=0;
Student(){
Interest++;
}
public static void main(String args[]){
Student a=new Student();
Student b=new Student();
Student c=new Student();
System.out.println(Student.Interest); //3
System.out.println(Interest); //valid in one class
}
} */

/*
class Student{
public static void Horn(){
System.out.println("BEEP! BEEP!");
}
public static void main(String args[]){
Student.Horn();
Horn();
}
} */

/*
class Student{
public static void Sum(int a,int b){
System.out.println(a+b);
}
public static void main(String args[]){
Student.Sum(3,4);
Sum(5,6);
}
} */

//FINAL
/*
class Student{
public static final double PI=3.14;
public static void main(String args[]){
System.out.println(Student.PI);
System.out.println(PI);
}
} */

/*
class Student{
public static void main(String args[]){
final int i;
i=143;
System.out.println(i);
}
} */

//FINAL METHOD
/*
class Student{
final void myFinalMethod(){
System.out.println("Hello World!");
}
}
class Student1 extends Student{
void myFinalMethod(){
System.out.println("Bye World!");
}
}
class checkFinalMethod{
public static void main(String args[]){
Student a=new Student1();
a.myFinalMethod(); //overridden method is final
}
} */

//FINAL CLASS
/*
final class Student{
public String name;
}
class Student1 extends Student{ //cannot inherit from final Student
String name="Diether Catan";
}
class checkFinal{
public static void main(String args[]){
Student1 a=new Student1();
System.out.println(a.name);
}
} */

//SUPER for parent class
/*
class Student{
int Age=20;
}
class Student1 extends Student{
int Age=19;
void displayAge(){
System.out.println("Student's age is "+super.Age+".");
}
}
class checkStudent{
public static void main(String args[]){
Student1 a=new Student1();
a.displayAge();
}
} */

//SUPER METHOD

class Student{
void message(){
System.out.println("Hello, I'm a student!");
}
}
class Person extends Student{
void message(){
System.out.println("Hello, I'm a person!");
}
void display(){
message();
super.message(); //calling the Student class' message
}
}
class checkStudent{
public static void main(String args[]){
Person a=new Person();
a.display();
}
} 

/*
class Student{
void intro(){
System.out.println("Hello, I'm Marianne!");
}
}
class Student1 extends Student{
void intro(){
System.out.println("Hello, I'm Diether!");
}
void introduction(){
intro();
super.intro();
}
}
class checkStudent{
public static void main(String args[]){
Student1 a=new Student1();
a.introduction();
}
} */

//SUPER CONSTRUCTOR
/*
class Student{
Student(){
System.out.println("I'm very beautiful!");
}
}
class Student1 extends Student{
Student1(){
super();
System.out.println("I'm very sexy!");
}
}
class checkStudent{
public static void main(String args[]){
Student1 a;
a=new Student1();
}
} */

/*
class Student{
Student(){
System.out.print("Hello");
}
}
class Student1 extends Student{
Student1(){
super();
System.out.print(" World!");
}
}
class checkStudent{
public static void main(String args[]){
Student1 a=new Student1();
}
} */
