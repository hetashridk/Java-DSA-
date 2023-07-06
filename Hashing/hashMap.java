import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert in hashmap
        hm.put("Tea", 10);
        hm.put("Coffee", 20);
        hm.put("Choco", 30);
        hm.put("Ice-cream", 50);

        // to print hashmap
        System.out.println(hm);

        // to get any node in hashmap
        System.out.println(hm.get("Choco"));

        // to check if hashmap contains key or not
        System.out.println(hm.containsKey("DM"));

        // to remove a node
        System.out.println(hm.remove("Tea"));
        System.out.println(hm);

        // to get the size of Hashmap
        System.out.println(hm.size());

        // to get if hashmap is empty or not
        System.out.println(hm.isEmpty());
    }
}
