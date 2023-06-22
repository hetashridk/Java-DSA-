public class transform_to_sumtree {
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

    public static int transform(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int newLeft;
        int newRight;

        if(root.left == null){
            newLeft = 0;
        }
        else{
            newLeft = root.left.data;
        }

        if(root.right == null){
            newRight = 0;
        }
        else{
            newRight = root.right.data;
        }

        int leftChild = transform(root.left);   //old values
        int rightChild = transform(root.right);   //old values

        int data = root.data;
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;

    }

     public static void preOrder(Node root){

                if(root == null){
                    // System.out.print("-1 ");
                    return;
                }
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        transform(root);
        preOrder(root);
    }    
}