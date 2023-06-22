import java.util.ArrayList;

public class Print_Path {

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


    // path to leaf
    public static void pathToLeaf(Node root, ArrayList<Integer> path){
        // base case 1
        if(root == null){
            return;
        }

        path.add(root.data);

        // base case 2
        if(root.left == null && root.right == null){
            printPath(path);
        }

        pathToLeaf(root.left, path);
        pathToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // to print path
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
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

        pathToLeaf(root, new ArrayList<>());
        
    }
}
