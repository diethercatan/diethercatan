import java.util.*;

public class MainFunction {
   public static void main(String[] args) {
      SampleArray obj = new SampleArray();
      obj.printNames();
      
      Student stA = new Student();
      stA.setName("Diether");
      stA.setAge(21);
      stA.printStudentProfile(stA.getName(),stA.getAge());
      
   }
}