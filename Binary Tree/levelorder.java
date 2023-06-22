// print a levelorder sequence

import java.util.*;
public class levelorder {

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

            public static void levelOrder(Node root){
                if(root == null){
                    return;
                }

                // making/creation of queue
                Queue<Node> q = new LinkedList<>();

                // add first node i.e; root
                q.add(root);

                // then add a null
                q.add(null);

                while(!q.isEmpty()){

                    // removing the node so that we can print it
                    Node currNode = q.remove();

                    if(currNode == null){
                        System.out.println();

                        // if currnod is null and we have to check that if queue is empty or not.. that is all nodes have been remove and been printed
                        if(q.isEmpty()){
                            break;
                        }

                        // if queue is not empty so add null as aa level new/next line print thy gayi to have next level par pan new/next line print thy jai
                        else{
                            q.add(null);
                        }
                    }

                    // if currnode is not null then add the node
                    else{
                        System.out.print(currNode.data + " ");

                        // if currNode nu left subtree null nathi to currnode na left subtree ne add kari do
                        if(currNode.left != null){
                            q.add(currNode.left);
                        }

                        // if currNode nu right subtree null nathi to currnode na right subtree ne add kari do
                        if(currNode.right != null){
                            q.add(currNode.right);
                        }
                    }
                }
            }
        }
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // creation of binary tree
        BinaryTree tree = new BinaryTree();

        // tree mate build tree ne call karisu
        Node root = tree.buildtree(nodes);

        tree.levelOrder(root);
    }
}