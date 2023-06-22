// swap two numbers
import java.util.ArrayList;
public class swap {
    public static void Swap(ArrayList<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before swap: " + list);
        Swap(list, 1, 3);
        System.out.println("After swap: " + list);
    }    
}