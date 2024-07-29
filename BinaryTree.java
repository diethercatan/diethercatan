// Java program for different tree traversals

// Class containing left and right child of current
// node and key value
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

// The BinaryTree class
public class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() { root = null; }

   // The printInorder method
	// Given a binary tree, print its nodes in inorder
	void printInorder(Node node) {
		if (node == null)
			return;

		// First recur on left child
		printInorder(node.left);

		// Then print the data of node
		System.out.print(node.key + " ");

		// Now recur on right child
		printInorder(node.right);
	}
  
   // The printPreorder method
   // Given a binary tree, print its nodes in preorder
  	void printPreorder(Node node) {
        if (node == null)
            return;
 
        // First print data of node
        System.out.print(node.key + " ");
 
        // Then recur on left subtree
        printPreorder(node.left);
 
        // Now recur on right subtree
        printPreorder(node.right);
    }

   // The printPostorder method
   // Given a binary tree, print its nodes according to the
   // "bottom-up" postorder traversal.
  	void printPostorder(Node node) {
        if (node == null)
            return;
 
        // First recur on left subtree
        printPostorder(node.left);
 
        // Then recur on right subtree
        printPostorder(node.right);
 
        // Now deal with the node
        System.out.print(node.key + " ");
    }	
  
	// main method
	static public void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(70);
		tree.root.left = new Node(65);
		tree.root.right = new Node(85);
		tree.root.left.left = new Node(30);
		//tree.root.left.right = new Node();
      //tree.root.right.left = new Node();
      tree.root.right.right = new Node(88);
		tree.root.left.left.left = new Node(10);
      tree.root.left.left.right = new Node(55);
      //tree.root.right.left.left = new Node();
      //tree.root.right.left.right = new Node();
      tree.root.left.left.left.right = new Node(25);
      tree.root.left.left.right.left = new Node(40);
      tree.root.left.left.right.right = new Node(60);
      tree.root.left.left.right.left.right = new Node(45);

		// Function call
		System.out.println("Inorder traversal of binary tree is: ");
		tree.printInorder(tree.root);
      System.out.println();
      
      System.out.println("\nPreorder traversal of binary tree is: ");
		tree.printPreorder(tree.root);
      System.out.println();
      
      System.out.println("\nPostorder traversal of binary tree is: ");
		tree.printPostorder(tree.root);
	   System.out.println();
   }
}