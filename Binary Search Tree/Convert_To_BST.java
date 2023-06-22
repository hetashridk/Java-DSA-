import java.util.ArrayList;

public class Convert_To_BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void Preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);

    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int ei){
        
        // base condition
        if(st >ei){
            return null;
        }

        int mid = (st + ei) / 2;
        Node root = new Node(inorder.get(mid));
        createBST(inorder, st, mid - 1);
        createBST(inorder, mid + 1, ei);
        return root;
    }
    public static Node convertToBST(Node root){

        // step1:- inorder sequence
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        getInorder(root, inorder);

        // step2:- to sort
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(6);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = convertToBST(root);
        Preorder(root);
        
    }
}
