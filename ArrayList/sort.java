// sorating an ArrayList
import java.util.ArrayList;
import java.util.Collections;
public class sort {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        list.add(5);
        System.out.println(list);

        // sort in ascending order
        Collections.sort(list);
        System.out.println(list);

        // sort in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }    
}