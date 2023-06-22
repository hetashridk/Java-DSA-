//  Check if a Binary Tree is univalued or not
// We have a binarytree, the task is to check if the binary tree is univalued or not. If found to be true, then print “YES”. Otherwise, print “NO”.
public class practice_Q1 {
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

    public static int uniValued(Node root){
        // base case
        if(root == null){
            return -1;
        }

         int newLeft;
        int newRight;

        if(root.left == null){
            newLeft = 0;
        }
        else{
            newLeft = root.left.data;
        }

        if(root.right == null){
            newRight = 0;
        }
        else{
            newRight = root.right.data;
        }
        int left = uniValued(root.left);
        int data1 = newLeft;
        int right = uniValued(root.right);
        int data2 = newRight;

        if(data1 == data2){
            return 1;
        }
        return 0;


        

    }

    
    public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(2);
        root.right.right = new Node(2);
        root.right.right.right = new Node(2);

        System.out.println(uniValued(root));
    }    
}