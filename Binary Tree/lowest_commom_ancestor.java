// print lowest common anscestor
import java.util.*;
public class lowest_commom_ancestor {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path){

        // add root in path
        path.add(root);
        //base case
        if(root == null){
            return false;
        }

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
    public static Node lca(Node root, int n1, int n2){
        // making of path
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);


        // step-2 :- common anscestor
        int i = 0;
        for(; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //path.get(i) - 1 becoz at ith position we get the node which is not equal.. and at the last position of i nodes are equal.
        Node lca = path1.get(i - 1);  

        return lca;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.println(lca(root, 3, 6).data);
    }    
}