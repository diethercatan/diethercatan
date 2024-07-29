class SimpleLinkedList {
   private String name;
   private SimpleLinkedList next;   
   
   SimpleLinkedList(String n) { name = n; next = null; }
   
   String getName() { return name; }
   SimpleLinkedList getNext() { return next; }
   
   void setName(String n) { name = n; }
   void setNext(SimpleLinkedList nxt) { next = nxt; }
   
   public String toString() { return name; }

   public static void main(String[] args) {
      // Construct six nodes
      SimpleLinkedList name0 = new SimpleLinkedList("Diether"); //null;
      SimpleLinkedList name1 = new SimpleLinkedList("Nathaniel");
      SimpleLinkedList name2 = new SimpleLinkedList("Jethro");
      SimpleLinkedList name3 = new SimpleLinkedList("Jheronimo");
      SimpleLinkedList name4 = new SimpleLinkedList("Janice");
      SimpleLinkedList name5 = new SimpleLinkedList("Brent");
      
      // Link the nodes into a chain 
      name0.setNext(name1);
      name1.setNext(name2);
      name2.setNext(name3);
      name3.setNext(name4);
      name4.setNext(name5);
      name5.setNext(null);
      
      // Traverse the Linked List
      SimpleLinkedList prnt = name0;
      //int i = 0;
      int count = 0; // count nodes
      
      // Traverse the Linked List in a loop
      while (prnt != null) {
         count++;
         //System.out.println("Name " + i + ": " + prnt);
         //i++;
         prnt = prnt.getNext();
      }
      
      System.out.println("Count of Nodes: " + count);
      //System.out.print("\nEnd of List");
   }
}
