public class NodeTester {
   public static void main(String[] args) {
      Node node0 = new Node(223);  
      Node node1 = new Node(493);
      Node node2 = new Node(717);

      System.out.println("Node 0: " + node0 + "Node 1: " + node1 + "Node 2: " + node2);
    
      node0.setValue(-34);
      node2.setValue(node1.getValue());

      System.out.println("After changes: ");
      System.out.println("Node 0: " + node0 + "Node 1: " + node1 + "Node 2: " + node2);  
   }
}