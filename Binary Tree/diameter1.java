// calculate the diameter of tree that is number of nodes in the longest path between two leaves

public class diameter1 {
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

    // used as helper function in this problem
    public static int height(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int leftDia = diameter(root.left);
        int leftHgt = diameter(root.left);
        int rightDia = diameter(root.right);
        int rightHgt = diameter(root.right);

        int self = leftHgt + rightHgt + 1;   //path passes through root

        return Math.max(self, Math.max(leftDia, rightDia));
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.print("diameter is: " + diameter(root));
    }    
}