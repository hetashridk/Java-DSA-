public class Valid_BST {
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

    public static boolean isValidBST(Node root, Node min, Node max){
        
        // base case
        if(root == null){
            return true;
        }

        // conditon
        if(min != null && min.data >= root.data){
            return false;
        }
        else if(max != null && max.data <= root.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int[] values = {1, 1, 1};
        Node root = null;

        // to build a BST
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        if(isValidBST(root, null, null)){
            System.out.println("Valid BST");
        }
        else{
            System.out.println("Invalid BST");
        }
    }
}
