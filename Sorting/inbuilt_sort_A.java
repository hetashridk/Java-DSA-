import java.util.Arrays;
public class inbuilt_sort_A{
    // To print arr
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 3, 1, 2};
        // Arrays.sort(arr);
        Arrays.sort(arr, 0 , 4);

        System.out.print("Sorted array is: ");
        printArr(arr);
                        
    }    
}