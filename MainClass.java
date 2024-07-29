class  {
   private String name;
   private int age;
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public int getAge() {
      return age;
   }
   
   public void setAge(int age) {
      this.age = age;
   }
   
   public static void printStudentProfile(String str, int num) {
      System.out.println("My name is " + str + " and I am " + num + " years old.");
   }
}

/*
public class MainClass {
   public static void main(String[] args) {
      Student first = new Student();
      first.setName("Diether");
      first.setAge(21);
   
      System.out.println(first.getName() + ", " + first.getAge());
   }
}
*/