// print a inorder sequence
public class inorder {

        // making the class
        static class Node{
            int data;
            Node left;
            Node right;

            // constructor
            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        static class BinaryTree{
            // trace the nodes
            static int index = -1;

            public static Node buildtree(int nodes[]){     //return type is Node means it will return the root node
                index++;

                if(nodes[index] == -1){
                    return null;
                }

                Node newNode = new Node(nodes[index]);
                newNode.left = buildtree(nodes);
                newNode.right = buildtree(nodes);

                return newNode;
            }

            public static void inOrder(Node root){

                if(root == null){
                    // System.out.print("-1 ");
                    return;
                }
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // creation of binary tree
        BinaryTree tree = new BinaryTree();

        // tree mate build tree ne call karisu
        Node root = tree.buildtree(nodes);

        tree.inOrder(root);
    }
}