import java.util.Collections;
public class inbuilt_sort_D{
    
    // To print arr
    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {5, 4, 3, 1, 2};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print("Sorted array is: ");
        printArr(arr);
                        
    }    
}