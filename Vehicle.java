//CLASSES AND OBJECTS with METHODS
/*
public class Vehicle{
int maxSpeed, wheels;
String color;
double fuelCapacity;
void horn1(){
System.out.println("The vehicle 1 has beep!beep! sound.");
}
void horn2(){
System.out.println("The vehicle 2 has vroom!vroom! sound.");
}
}

class Ourclass{
public static void main(String args[]){
Vehicle v1=new Vehicle();
Vehicle v2=new Vehicle();
System.out.println("\tMAX SPEED");
v1.maxSpeed=30;
printmaxSpeed("v1",v1.maxSpeed);
v2.maxSpeed=20;
printmaxSpeed("v2",v2.maxSpeed);
System.out.print("\n");
System.out.println("\tWHEELS");
v1.wheels=4;
printwheels("v1",v1.wheels);
v2.wheels=5;
printwheels("v2",v2.wheels);
System.out.print("\n");
System.out.println("\tCOLOR");
v1.color="blue";
printcolor("v1",v1.color);
v2.color="red";
printcolor("v2",v2.color);
System.out.print("\n");
System.out.println("\tFUEL CAPACITY");
v1.fuelCapacity=25.210;
printfuelCapacity("v1",v1.fuelCapacity);
v2.fuelCapacity=40.350;
printfuelCapacity("v2",v2.fuelCapacity);
System.out.print("\n");
System.out.println("\tHORN");
v1.horn1();
v2.horn2();
System.out.print("\n");
}

static void printmaxSpeed(String vehicle,int maxSpeed){
switch(vehicle){
case "v1":System.out.println("The vehicle 1 has "+maxSpeed+"kpwh.");break;
case "v2":System.out.println("The vehicle 2 has "+maxSpeed+"kwph.");break;
}
}

static void printwheels(String vehicle,int wheels){
switch(vehicle){
case "v1":System.out.println("The vehicle 1 has "+wheels+" wheel/s.");break;
case "v2":System.out.println("The vehicle 2 has "+wheels+" wheel/s.");break;
}
}

static void printcolor(String vehicle,String color){
switch(vehicle){
case "v1":System.out.println("The vehicle 1 has "+color+" color.");break;
case "v2":System.out.println("The vehicle 2 has "+color+" color.");break;
}
}

static void printfuelCapacity(String vehicle,double fuelCapacity){
switch(vehicle){
case "v1":System.out.println("The vehicle 1 has "+fuelCapacity+" liter/s.");break;
case "v2":System.out.println("The vehicle 2 has "+fuelCapacity+" liter/s.");break;
}
}
} */

//ACCESS MODIFIERS
//PUBLIC - accessible from any other class.
//DEFAULT - no access control modifier, available to any other class in the same package.
//PROTECTED - same with default access modifier.
//PRIVATE - accessible only within the declared class itself. 
/*
public class Vehicle{
private int maxSpeed;
default int wheels; //modifier default not allowed here
protected String color;
public double fuelCapacity;

public void horn(){
System.out.println("beep!beep!");
}
}

class Ourclass{
public static void main(String args[]){
Vehicle v1=new Vehicle();
v1.maxSpeed=25; //maxSpeed has private access in Vehicle
System.out.println(v1.maxSpeed);
v1.wheels=4;
System.out.println(v1.wheels);
v1.color="red";
System.out.println(v1.color);
v1.fuelCapacity=40.525;
System.out.println(v1.fuelCapacity);
v1.horn();
}
} */

