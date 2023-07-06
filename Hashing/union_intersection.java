import java.util.HashSet;

public class union_intersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // union
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Element present in union will be " + set.size());

        // printing element of union
        for (Integer element : set) {
            System.out.print(element + " ");
        }


        // intersection
        set.clear();
        // store a arr in set
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        // compare with other array
        System.out.print("\nIntersection element is ");
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                // printing intersection element
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
        // printing the count
        System.out.println("\nElement present in intersection is " + count);
    }
}
