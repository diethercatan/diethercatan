class SimpleNode {
   private String name;
   private SimpleNode next;
   
   SimpleNode(String n) { name = n; next = null; }
   
   String getName() { return name; }
   SimpleNode getNext() { return next; }
   
   void setName(String n) { name = n; }
   void setNext(SimpleNode nxt) { next = nxt; }
   
   public String toString() { return name + " \n"; }
   
   public static void main(String[] args) {
      SimpleNode name0 = new SimpleNode("Diether");
      SimpleNode name1 = new SimpleNode("Marianne");
      //SimpleNode name2 = new SimpleNode("Sofia");
      
      System.out.println("Before change: ");
      System.out.println("Name0: " + name0 + "Name1: " + name1); // + "Name2: " + name2);
   
      name0.setNext(name0);
      //name1.setName("Dianne");
      //name2.setName("Katana");
      
      System.out.println("After change: ");
      System.out.println("Name0: " + name0.getNext() + "Name1: " + name0.getNext()); // + "Name2: " + name2);
   }
}
