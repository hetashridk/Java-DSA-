public class wordbreak {

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

    public static boolean wordBreak(String key){
        // base case
        if(key.length() == 0){
            return true;
        }

        for(int i = 1; i <= key.length(); i++){

            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        System.out.println(wordBreak("ilikesamsung"));
    }
}
