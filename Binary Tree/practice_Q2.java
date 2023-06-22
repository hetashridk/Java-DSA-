// Invert Binary Tre eMirror of a Tree: Mirror of a Binary TreeT is another Binary TreeM(T) with left and right children of all non-leaf nodes interchanged.
public class practice_Q2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node invert(Node root){
        // base case
        if(root == null){
            return root;
        }

        Node left = invert(root.left);
        Node right = invert(root.right);
        
        // swap
        root.left = right;
        root.right = left;

        return root;
    }
    public static void inOrder(Node root){

        if(root == null){
            // System.out.print("-1 ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        inOrder(root);
        invert(root);
        System.out.println();
        inOrder(root);
    }    
}