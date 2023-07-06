import java.util.HashMap;
import java.util.Set;

public class iterator {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("Indonesia", 100);
        hm.put("China", 160);
        hm.put("US", 75);

        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("key=" + k + ", value=" + hm.get(k));
        }

        
    }
}
