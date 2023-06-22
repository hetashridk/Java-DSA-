// calculate the count of  total number of nodes of tree that is by recursively
public class count_nodes {
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

    public static int count(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int lcount = count(root.left);
        int rcount = count(root.right);

        return lcount + rcount + 1;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.print("Total number of nodes is: " + count(root));
    }    
}