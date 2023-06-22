import java.util.*;
public class bubble_sort {
    public static void bubbleSort(int arr[]){
        
        // For number of passes/turns.
        for(int turn = 0; turn < arr.length - 1; turn++){

            // Compare element
            for(int j = 0; j < arr.length - 1 - turn; j++){     //Or for(j = 0; j <= arr.length - 2 - turn; j++)
                if(arr[j] > arr[j + 1]){

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        bubbleSort(arr);

        System.out.print("Sorted array is: ");
        printArr(arr);                
    }    
}