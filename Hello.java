class HelloObject {
   public void greeting(){
      System.out.println("Hello");
   }
}

public class Hello {
   public static void main(String[] args) {
      HelloObject obj1 = new HelloObject();
      HelloObject obj2 = new HelloObject();
      HelloObject obj3 = new HelloObject();
      HelloObject obj4 = new HelloObject();
      HelloObject obj5 = new HelloObject(); 
      obj1.greeting();
      obj2.greeting();
      obj3.greeting();
      obj4.greeting();
      obj5.greeting();
   }
}