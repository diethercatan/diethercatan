public class Node {

   private Node next;
   private int value;
  
   // Constructor. Make a Node containing val.
   // Initialize next to null
   public Node(int val) {
      value = val;
      next = null;
   }
  
   public int  getValue() { return value; }  // get the value in this Node
   public Node getNext()  { return next; }   // get a pointer to another Node
  
   public void setValue(int val) { value = val; }
   public void setNext(Node nxt) { next = nxt; } 
  
   public String toString() { return value + ", "; }
}