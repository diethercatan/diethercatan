//THIS
/*
class Test{
int a,b;
Test(int a,int b){
this.a=a;
this.b=b;
}
void obj(){
System.out.println("a = "+a+"\nb = "+b);
}
public static void main(String args[]){
Test a=new Test(10,20);
a.obj();
}
} */

/*
class Test{
String name;
Test(String name){
this.name=name;
}
void print(){
System.out.println("Name: "+name);
}
public static void main(String args[]){
Test a=new Test("Diether Catan");
a.print();
}
} */

//THIS CONSTRUCTOR
/*
class Test{
int a,b;
Test(){
this(10,20);
System.out.println("Default constructor!");
}
Test(int a,int b){
this.a=a;
this.b=b;
System.out.println("Parameterized constructor: "+(a+b));
}
public static void main(String args[]){
Test a=new Test();
}
} */

/*
class Test{
String name;
int age;
Test(){
this("Diether Catan",21);
}
Test(String name,int age){
this.name=name;
this.age=age;
System.out.println("Hello everyone, My name is "+name+".");
System.out.println("I am "+age+" years old.");
}
public static void main(String args[]){
Test ditz=new Test();
}
} */

/*
import java.util.*;
class Test{
String name;
int age;
Test(){
System.out.println("Enter your full name: ");
Scanner input=new Scanner(System.in);
String name=input.nextLine();
System.out.println("Enter your real age: ");
Scanner input1=new Scanner(System.in);
int age=input1.nextInt();
System.out.println("Hello everyone, My name is "+name+".");
System.out.println("I am "+age+" years old.");
}
public static void main(String args[]){
Test ditz=new Test();
}
} */

/*
class Test{
String name;
int age;
double money;
Test(String name,int age,double money){
this.name=name;
this.age=age;
this.money=money;
System.out.println("Name: "+name);
System.out.println("Age: "+age);
if(money>0)
System.out.println("Money: "+money);
else
System.out.println("Money: (no money)");
}
public static void main(String args[]){
Test a=new Test("Diether Catan",21,1200.00);
}
} */

/*
import java.util.*;
class Test{
String name;
int age;
double money;
Test(String name,int age,double money){
this.name=name;
this.age=age;
this.money=money;
System.out.println("\nName: "+name);
System.out.println("Age: "+age);
if(money>0)
System.out.println("Money: "+money);
else
System.out.println("Money: (no money)");
}
public static void main(String args[]){
System.out.println("Enter your full name: ");
Scanner input=new Scanner(System.in);
String name=input.nextLine();
System.out.println("Enter your real age: ");
Scanner input1=new Scanner(System.in);
int age=input1.nextInt();
System.out.println("Enter your money wallet: ");
Scanner input2=new Scanner(System.in);
double money=input2.nextDouble();
Test a=new Test(name,age,money);
System.out.println("\nProfile Completed!");
}
} */

//THIS AND SUPER METHOD
/*
class Test{
int a,b;
Test(){
System.out.println("Parent default constructor!");
}
Test(int a,int b){
this();
this.a=a;
this.b=b;
System.out.println("Parent parameterized constructor!");
}
}
class Test1 extends Test{
Test1(){
super(10,30);
System.out.println("\nChild default constructor!");
}
Test1(int x,int y){
this();
System.out.println("Child parameterized constructor: "+(x+y));
System.out.println("Parent parameterized constructor: "+(a+b));
}
public static void main(String args[]){
Test1 a=new Test1(20,40);
}
} */

//INTERFACE (where multiple inheritance is allowed)
/*
interface Test{
public void intro();
public void age();
public int Age=21;
}
interface Exam{
public void when();
}
class Test1 implements Test,Exam{
public void intro(){
System.out.println("Hello, I'm Diether Catan!");
}
public void age(){
System.out.println("I'm "+Age+" years old.");
}
public void when(){
System.out.println("The exam will be tomorrow!");
}
public static void main(String args[]){
Test1 a;
a=new Test1();
a.intro();
a.age();
a.when();
}
} */

/*
import java.util.*;
interface Test{
public void StudentnameAge();
public void Student1nameAge();
public void Student2nameAge();
}
class Student implements Test{
public void StudentnameAge(){
System.out.println("Enter the First Student name: ");
Scanner inputName=new Scanner(System.in);
String Name=inputName.nextLine();
System.out.println("Enter "+Name+"'s age: ");
Scanner inputAge=new Scanner(System.in);
int Age=inputAge.nextInt();
System.out.println("\nHello, I'm "+Name+"!");
System.out.println("I'm "+Age+" years old.");
}
public void Student1nameAge(){
System.out.println("\nEnter the Second Student name: ");
Scanner inputName1=new Scanner(System.in);
String Name1=inputName1.nextLine();
System.out.println("Enter "+Name1+"'s age: ");
Scanner inputAge1=new Scanner(System.in);
int Age1=inputAge1.nextInt();
System.out.println("\nHello, I'm "+Name1+"!");
System.out.println("I'm "+Age1+" years old.");
}
public void Student2nameAge(){
System.out.println("\nEnter the Third Student name: ");
Scanner inputName2=new Scanner(System.in);
String Name2=inputName2.nextLine();
System.out.println("Enter "+Name2+"'s age: ");
Scanner inputAge2=new Scanner(System.in);
int Age2=inputAge2.nextInt();
System.out.println("\nHello, I'm "+Name2+"!");
System.out.println("I'm "+Age2+" years old.");
}
public static void main(String args[]){
Student a,b,c;
a=new Student();
b=new Student();
c=new Student();
a.StudentnameAge();
b.Student1nameAge();
c.Student2nameAge();
}
} */

//TYPE CASTING 
/*
class Test{
public static void main(String args[]){
double a=14.45;
int b=(int)a;
double c=Math.ceil(a); //rounded value
int d=11;
double e=(double)d;
String f="-21";
int g=Integer.parseInt(f); //for String conversion
g=Math.abs(g); //negative to positive integer
int h=(int)13.95;
double i=45.65;
int j=(int)Math.ceil(i); //from 46.0 to 46
System.out.println(b);
System.out.println(c);
System.out.println(e);
System.out.println(g);
System.out.println(h);
System.out.println(j);
}
} */

/*
class Test{
public static void main(String args[]){
int x=20;
int a;
double y=12.45;
double z=45.6999;
System.out.println(x);
y=x; //implicit datatype casting
System.out.println(y);
x=(int)z; //explicit datatype casting
System.out.println(x);
a=z; //lossy conversion from double to int
System.out.println(a);
}
} */

//OBJECT TYPECASTING
/*
class Test{
void when(){
System.out.println("When do you plan to get pregnant? ");
}
}
class Test1 extends Test{
void when(){
System.out.println("When do you plan to get married? ");
}
}
class checkTest{
public static void main(String args[]){
Test a=new Test();
Test1 b=new Test1();
a=b; //implicit (cast an instance of a subclass to its superclass)
b=(Test1)a; //explicit (cast an object of a superclass to its subclass)
a.when();
b.when();
}
} */

//ANONYMOUS CLASS
/*
class Test{
void mssg(){
System.out.println("I'm still a virgin!");
}
public static void main(String args[]){
Test a=new Test(){
@Override //annotation
void mssg(){
System.out.println("I'm already a hoe!");
}
};
a.mssg();
}
} */

/*
class Test{
void mssg(){
System.out.println("Hello");
}
}
class Test1 extends Test{
void mssg(){
System.out.println("Hi");
}
}
class checkTest{
public static void main(String args[]){
Test a=new Test(){
void mssg(){
System.out.println("Hey");
}
};
Test1 b=new Test1(){
void mssg(){
System.out.println("Hellaur");
}
};
a=b;
a.mssg();
b=(Test1)a;
b.mssg();
}
} */

/*
import java.util.*;
class Test{
void ask(){
System.out.println("\nHow old are you? ");
Scanner inputAge=new Scanner(System.in);
int Age=inputAge.nextInt();
if(Age>1)
System.out.println("I'm "+Age+" years old!");
else
System.out.println("She is "+Age+" year old!");
}
}
class Test1 extends Test{
void ask(){
System.out.println("\nWhat is your name? ");
Scanner inputName=new Scanner(System.in);
String Name=inputName.nextLine();
System.out.println("Her name is "+Name+".");
}
}
class checkTest{
public static void main(String args[]){
Test a=new Test(){
void ask(){
System.out.println("\nAre you single? [YES] [NO]");
Scanner inputSingle=new Scanner(System.in);
String Single=inputSingle.nextLine();
switch(Single){
case "YES":System.out.println("She answered 'YES'!");break;
case "NO":System.out.println("She answered 'NO'!");break;
default:System.out.println("She didn't answer!");break;
}
}
};
Test1 b=new Test1(){
void ask(){
System.out.println("\nWhat is your favorite subject? ");
Scanner inputSubject=new Scanner(System.in);
String Subject=inputSubject.nextLine();
System.out.println("Her favorite subject is "+Subject+"!");
}
};
a.ask();
b.ask();
}
} */