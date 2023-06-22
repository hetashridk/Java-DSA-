import java.util.*;
public class insertion_sort {
    public static void insertionSort(int arr[]){

        // outer loop
        for(int i = 1; i < arr.length;i++){
            int curr = arr[i];
            int prev = i - 1;
            
            // find correct position where to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];   //To push at position.
                prev--;
            }

            // insertion
            arr[prev + 1] = curr;
            // if at some time prev become -1 or it just goes in negative.
            // or koi vaar ek index oochu thy jase correct position thi.
        }
        
    }

    // To print arr
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("How many elments you want to be sort: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int  i = 0; i < n; i++){
            System.out.print("Enter the array numbers: "); 
            arr[i] = sc.nextInt();
        }    
        insertionSort(arr);

        System.out.print("Sorted array is: ");
        printArr(arr);                  
    }                 
     
}