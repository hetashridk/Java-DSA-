import java.util.ArrayList;
public class operation {
    public static void main(String args[]){

        // creating arraylist
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        // OPERATIONS   

        // add
        // 1, 2, 3, 5, 6 is element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);

        // 4 is element and 3 is the index at which 4 element wil store
        list1.add(3, 4);
        System.out.println(list1);

        // get element
        // 3 is the index
        System.out.println(list1.get(3));

        // remove element
        // 5 is the index
        list1.remove(5);
        System.out.println(list1);

        // set element at index
        // 4 is index and 6 is element
        list1.set(4, 6);
        System.out.println(list1);

        // contains element
        // 2 is element
        System.out.println(list1.contains(2));

        // size method/function
        System.out.println(list1.size());
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
    }    
}