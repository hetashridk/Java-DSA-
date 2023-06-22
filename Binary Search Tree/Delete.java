public class Delete {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // to Delete
    public static Node delete(Node root, int key){

        // to find node/value/key

        // to find in left subtree
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        // to find in right subtree
        else if(root.data < key){
            root.right = delete(root.right, key);
        }

        // found the key
        else{

            // check the case
            
            // case 1 :- no leaf
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 :- single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 :- Both childer

            // find inorder successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }


    // to findInorderSuccessor
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
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

        root = delete(root, 11);
        inorder(root);
        System.out.println();
    }
}
