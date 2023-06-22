

public class Create_BST {
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

    public static Node createBST(int arr[], int st, int ei){
        // base condition

        if(st > ei){
            return null;
        }

        int mid = (st + ei) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, ei);
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 13};
        Node root = createBST(arr, 0, arr.length - 1);
        Preorder(root);
    }
    
}
