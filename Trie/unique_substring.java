public class unique_substring {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            // to store null in children array
            for(int i = 0; i < children.length; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int level = 0; level < word.length(); level++){
            int index = word.charAt(level) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }

        curr.eow = true;
    }

      public static boolean search(String key){
        Node curr = root;

        for(int level = 0; level < key.length(); level++){
            int index = key.charAt(level) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }

        return curr.eow == true;
    }


    // step 3:- to count nodes
    public static int uniqueString(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                count += uniqueString(root.children[i]);
            }
        }

        return count + 1;
    }
    public static void main(String[] args) {
        String str = "hetashri";

        // step 1 and step 2:- to find suffix and insert it
        for(int i = 0; i < str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(uniqueString(root));
    }
}
