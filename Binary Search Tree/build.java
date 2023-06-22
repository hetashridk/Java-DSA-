public class build {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
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
    public static void main(String args[]){
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // to build a BST
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        // to print inorder
        inorder(root);
        System.out.println();
    }    
}