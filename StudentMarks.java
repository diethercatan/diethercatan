class StudentMarks{
public static void main(String args[]){
System.out.println("Student Name: "+args[0]);
System.out.println("Student rollno: "+args[1]);
double avg=0;
for(int i=2;i<args.length;i++){
avg=avg+Integer.parseInt(args[i]);
}
System.out.println("Total marks: "+avg);

}
}