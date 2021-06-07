package Binary_Tree;
public class BinarryTreeApp {
 public static void main(String[] args){
     BinaryTree tree = new BinaryTree();
     TreeNode node;
     node = new TreeNode(55);
     tree.insert(node);
     
     node = new TreeNode(35);
     tree.insert(node);
     
     node = new TreeNode(45);
     tree.insert(node);
     
     node = new TreeNode(75);
     tree.insert(node);
     
     node = new TreeNode(65);
     tree.insert(node);
     
     node = new TreeNode(85);
     tree.insert(node);
     
     System.out.print("Traveral dengan preorder ");
     tree.preOrder();
     System.out.print("\nTraveral dengan inorder ");
     tree.inOrder();
     System.out.print("\nTraveral dengan postorder ");
     tree.postOrder();
     System.out.println();
 }   
}

