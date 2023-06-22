
import java.util.*;
public class mergeBST {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int ei){
        // base condition

        if(st > ei){
            return null;
        }

        int mid = (st + ei) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, ei);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node mergeBST(Node root1, Node root2){

        // step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //step3:- mergeBST
        int i = 0;
        int j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                arr.add(arr1.get(i));
                i++;
            }
            else{
                arr.add(arr1.get(j));
                j++;
            }
        }

        while(i < arr1.size()){
            arr.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size()){
            arr.add(arr2.get(j));
            j++;
        }

        // step4:- createBST
        return createBST(arr, 0, arr.size() - 1);
    }

    
    public static void Preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);

    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root1.left = new Node(3);
        root1.right = new Node(12);

        Node root = mergeBST(root1, root2);
        Preorder(root);
        
    }
}
