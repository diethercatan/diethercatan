class Node1 {
   private int number;
   private Node1 next;
   
   Node1(int num) {
      number = num;
      next = null;
   }
   
   int getNumber() { return number; }
   Node1 getNext() { return next; }
   
   void setNumber(int num) { number = num; }
   void setNext(Node1 nxt) { next = nxt; } 
   
   public String toString() { return number + ", "; }    
   
   public static void main(String[] args) {
      Node1 node0 = new Node1(1);
      Node1 node1 = new Node1(2); node0.setNext(node1);
      Node1 node2 = new Node1(3); node1.setNext(node2);
      
      //System.out.print("Node 0 : " + node0 + "Node 1: " + node1 + "Node 2: " + node2);
      
      Node1 p = node0;
      
      while (p != null) {
         System.out.print(p);
         p = p.getNext();
      }
   }
} 

/*
class Node1 {
   private String name;
   private Node1 next;
   
   Node1(String n) {
      name = n;
      next = null;
   }
   
   String getName() { return name; }
   Node1 getNext() { return next; }
   
   void setName(String n) { name = n; }
   void setNext(Node1 nxt) { next = nxt; } 
   
   public String toString() { return name + ", "; }    
   
   public static void main(String[] args) {
      Node1 node0 = new Node1("Diether");
      Node1 node1 = new Node1("Marianne");
      Node1 node2 = new Node1("Sofia");
      
      System.out.println("Node 0 : " + node0 + "Node 1: " + node1 + "Node 2: " + node2);
      
      node0.setName("Kim");
      node1.setName(node0.getName());
      node2.setName(node1.getName());
      
      System.out.println("After change:");
      System.out.println("Node 0 : " + node0 + "Node 1: " + node1 + "Node 2: " + node2);
   }
}
*/



