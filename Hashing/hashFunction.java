import java.util.ArrayList;
import java.util.LinkedList;



public class hashFunction {
    public static class HashMap<K, V> { // K and V are generic that is the datatype of K and V can be any that is
                                        // general
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K key) {

            // hashcode() will convert key into other form
            int hc = key.hashCode();

            // the form can be negative so we have to convert in to positive so we do
            // absolute value
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                // if the key is == to our key
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            
            // storing buckets node in old bucket
            LinkedList<Node> oldBucket[] = buckets;

            // bucket is being empty and it size is being double
            buckets = new LinkedList[N * 2];

            N = 2 * N;

            // For storing LinkedList in bucket and adding nodes into double size bucket

            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];

                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            // if key exits then
            if (di != 1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            // when key won't exits and we have to add it then
            else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            // if want to perform rehashing
            double lambda = (double)n / N;

            int k = 2;

            if (lambda > k) {
                rehash();
            }

        }

        public boolean containsKey(K key) {
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            // if key exits then
            if (di != 1) {
                return true;
            }
            // when key won't exits
            else {
                return false;
            }
        }

        public V get(K key){
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            // if key exits then
            if(di != 1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            // when key won't exits
            else{
                return null;
            }
        }

        public V remove(K key){
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            // if key exits then
            if(di != 1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            // when key won't exits
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 200);
        hm.put("China", 250);
        hm.put("Nepal", 40);
        hm.put("Pakistan", 25);
        hm.put("Bhutan", 75);
        hm.put("US", 70);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
