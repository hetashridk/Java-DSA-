// given roots of two binary trees root and subRoot, return true if there is a subtree of root with same structure and nides values of subroot and false otherwise
public class subtree {
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

    
    //will see that the subtree is identical to tree or not
    public static boolean isIdentical(Node node, Node subRoot){    //here node is which it is been find in isSubTree
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    // will find the subroot in tree
    public static boolean isSubTree(Node root, Node subRoot){

        //base case
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        // find the subRoot in left subtree of tree and right subtree of tree;
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
    public static void main(String args[]){

        // making the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // making the subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root, subRoot));

        
    }    
}