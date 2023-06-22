// print lowest common anscestor
import java.util.*;
public class lowest_common_ancestor2 {
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

    public static Node lca2(Node root, int n1, int n2){
        // base case
        // if(root.data == null){
        //     return root;
        // }
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node lcaLeft = lca2(root.left, n1, n2);
        Node lcaRight = lca2(root.right, n1, n2);

        // if left lca is null i.e; right lca has value then return rightlca
        if(lcaLeft == null){
            return lcaRight;
        }

        // if right lca is null i.e; left lca has value then return leftlca
        if(lcaRight == null){
            return lcaLeft;
        }

        // if badhu baraber hoi to
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.println(lca2(root, 3, 6).data);
    }    
}