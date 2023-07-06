import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class iteratorSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Surat");
        cities.add("Vapi");
        cities.add("Ananad");
        cities.add("Valsad");

        // using iterator
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // using advance enchance loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
