public class prefix {

    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i = 0; i < children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;

        for(int i = 0; i < words.length(); i++){
            int index = words.charAt(i) - 'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            else{
                curr.children[index].freq++;
            }

            curr = curr.children[index];
        }

        curr.eow = true;
    }

    public static void Prefix(Node root, String ans){
        // base case 1
        if(root == null){
            return;
        }

        // base case 2
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null){
                Prefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "dove", "duck"};

        // to insert
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

         root.freq = -1;

       Prefix(root, " ");
    }
}
