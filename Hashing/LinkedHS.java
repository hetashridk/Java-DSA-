import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHS {
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
    }
}
