// print all nodes of kth level
public class kth_level {
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

    public static void KthLevel(Node root, int level, int k){

        // base case
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return;      //return becoz if we got the level them we don't have to check another/other levels
        }

        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        KthLevel(root, 1, 3);
    }    
}