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
    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "dove", "duck"};

        // to insert
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
    }
}
