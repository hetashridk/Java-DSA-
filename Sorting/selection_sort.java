import java.util.*;
public class selection_sort {
    public static void selectionSort(int arr[]){

        // outer loop
        // for number of turns
        // number of turns = i
        for(int i = 0; i < arr.length - 1; i++){
            int minpos = i;    //assume current position element = minimum element

            // inner loop
            for(int  j = i + 1 ; j < arr.length; j++){    //or j <= arr.length - 1
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }

            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);

        System.out.print("Sorted array is: ");
        printArr(arr);                  
    }    
}