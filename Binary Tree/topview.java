//  topview of a tree
import java.util.*;
public class topview {
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

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd =hd;
        }
    }

    public static void topView(Node root){

        // Creation of queue for the level order traversal
        Queue<Info> q = new LinkedList<>();

        // creation of hashmaps to store key(hd), value(node) pair
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max= 0;

        q.add(new Info(root, 0));  //add main root and hd of that root in queue...as main root hd is always 0
        q.add(null);   //add null so to get new line or next line

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }

            else{

                // condition when the key exits/occur for the first time
                if(!map.containsKey(curr.hd)){      //containsKey() vj=heck whether the key exists in map or not
                    map.put(curr.hd, curr.node);
                }   

                // for left subtree
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                // for right subtree
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
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
        topView(root);

        
    }    
}