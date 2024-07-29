/*import java.util.Scanner;
class Method{ //Important reminder: The functions can be placed at first or last. */

//FIRST
/*
static int inputNum(){
Scanner num=new Scanner(System.in);
return (num.nextInt());
}


static void printAsk(int num){
switch(num){
case 0:System.out.println("Input the first number: ");break;
case 1:System.out.println("Input the second number: ");break;
}
}

static int calculation(int a,int b){
return (a+b);
}

static void displaySum(int a,int b,int sum){
System.out.println("The sum of "+a+" and "+b+" is "+sum+".");
}

public static void main(String args[]){
int a,b,sum;
printAsk(0);
a=inputNum();
printAsk(1);
b=inputNum();
sum=calculation(a,b);
displaySum(a,b,sum);
}
} */

//LAST
/*
public static void main(String args[]){
int a,b,sum;
printAsk(0);
a=inputNum();
printAsk(1);
b=inputNum();
sum=calculation(a,b);
displaySum(a,b,sum);
}

static int inputNum(){
Scanner num=new Scanner(System.in);
return (num.nextInt());
}


static void printAsk(int num){
switch(num){
case 0:System.out.println("Input the first number: ");break;
case 1:System.out.println("Input the second number: ");break;
}
}

static int calculation(int a,int b){
return (a+b);
}

static void displaySum(int a,int b,int sum){
System.out.println("The sum of "+a+" and "+b+" is "+sum+".");
}
} */

import java.util.*;
public class Method{
private String studentName;
private long studentIDnumber;
private String schoolName;
Method(){
this.setSchoolName("University of Cebu");
}
Method(String schoolName){
this.setSchoolName(schoolName);
}
public String getSchoolName(){
return schoolName;
}
public void setSchoolName(String schoolName){
this.schoolName=schoolName;
}
public static void main(String args[]){
Method student1=new Method();
Method student2=new Method("University of San Carlos");
Method student3=new Method("University of San Jose Recoletos");
askstudentName(1);
student1.studentName=enterstudentName();
askstudentIDnumber(1);
student1.studentIDnumber=enterstudentIDnumber(1);
if(student1.studentIDnumber>999999){
while(student1.studentIDnumber>999999){
System.out.println("Error! Try Again!");
askstudentIDnumber(1);
student1.studentIDnumber=enterstudentIDnumber(1);
}
}
System.out.print("\n");
askstudentName(2);
student2.studentName=enterstudentName();
askstudentIDnumber(2);
student2.studentIDnumber=enterstudentIDnumber(2);
if(student2.studentIDnumber>999999){
while(student2.studentIDnumber>999999){
System.out.println("Error! Try Again!");
askstudentIDnumber(2);
student2.studentIDnumber=enterstudentIDnumber(2);
}
}
System.out.print("\n");
askstudentName(3);
student3.studentName=enterstudentName();
askstudentIDnumber(3);
student3.studentIDnumber=enterstudentIDnumber(3);
if(student3.studentIDnumber>999999){
while(student3.studentIDnumber>999999){
System.out.println("Error! Try Again!");
askstudentIDnumber(3);
student3.studentIDnumber=enterstudentIDnumber(3);
}
}
printstudentProfile(1,student1.studentName,student1.studentIDnumber,student1.getSchoolName());
printstudentProfile(2,student2.studentName,student2.studentIDnumber,student2.getSchoolName());
printstudentProfile(3,student3.studentName,student3.studentIDnumber,student3.getSchoolName());
}
static void askstudentName(int num){
switch(num){
case 1:System.out.println("Enter the Student 1 name: ");break;
case 2:System.out.println("Enter the Student 2 name: ");break;
case 3:System.out.println("Enter the Student 3 name: ");break;
}
}
static String enterstudentName(){
Scanner studentName=new Scanner(System.in);
return (studentName.nextLine());
}
static void askstudentIDnumber(int num){
switch(num){
case 1:System.out.println("Enter the Student 1 ID number (6-digit): ");break;
case 2:System.out.println("Enter the Student 2 ID number (6-digit): ");break;
case 3:System.out.println("Enter the Student 3 ID number (6-digit): ");break;
}
}
static long enterstudentIDnumber(int num){
Scanner studentIDnumber=new Scanner(System.in);
return (studentIDnumber.nextLong());
}
static void printstudentProfile(int num,String studentName,long studentIDnumber,String schoolName){
System.out.println("\n\tSTUDENT "+num+" PROFILE");
System.out.println("Student Name: "+studentName);
System.out.println("ID Number: "+studentIDnumber);

if(schoolName=="University of Cebu")
System.out.println("School Name: "+schoolName+" (our student)");
else
System.out.println("School Name: "+schoolName+" (not our student)");
}
}

