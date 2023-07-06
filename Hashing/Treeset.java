import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Surat");
        cities.add("Vapi");
        cities.add("Ananad");
        cities.add("Valsad");
        System.out.println(cities);


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Surat");
        lhs.add("Vapi");
        lhs.add("Ananad");
        lhs.add("Valsad");
        System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Surat");
        ts.add("Vapi");
        ts.add("Ananad");
        ts.add("Valsad");
        System.out.println(ts);
    }
}
