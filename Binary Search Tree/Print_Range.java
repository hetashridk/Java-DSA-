public class Print_Range {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // print in Print_Range
    public static void printInRange(Node root, int k1, int k2){

        // base case
        if(root == null){
            return;
        }

        // case 1:-
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        // case 2:-
        else if(root.data < k1){
            printInRange(root.right, k1, k2);
        }

        // case 3:-
        else{
            printInRange(root.left, k1, k2);
        }
    }
    // to insert in BST
    public static Node insert(Node root, int val){

        // base case
        if(root == null){
            root = new Node(val);
            return root;
        }

        // left subtree
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        // right subtree
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    // inorder traversal
    public static void inorder(Node root){

        // base case
        if(root == null){
            return;
        }


        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        // to build a BST
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        // to print inorder
        inorder(root);
        System.out.println();

        printInRange(root, 2, 13);
    }
}
