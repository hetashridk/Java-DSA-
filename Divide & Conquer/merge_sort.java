import java.util.*;
public class merge_sort {

    // to print array
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // to merge array
    public static void mergeSort(int arr[], int si, int ei){

        // base case
        if(si >= ei){
            return;
        }

        // kaam
        int mi = si + (ei - si)/2;
        
        // for left part sorting, starting index = si and ending index = mi
        mergeSort(arr, si, mi);

        // for right part sorting, starting index = mi + 1 and ending index = ei
        mergeSort(arr, mi + 1, ei);

        // to merge left and right part
        merge(arr, si, mi, ei);
    }

    // to merge left and right part
    public static void merge(int arr[], int si, int mi, int ei){

        // temporaray array

        // left part(0 ,5) so si = 0
        // right part(6, 9) so ei = 9
        // so original array size is 10
        // 9 - 0 = 9
        // but we are only geeting size 9
        // so we add 1 to it.
        int temp[] = new int[ei - si + 1];

        int i = si;  //for left, iterator
        int j = mi + 1;  //for right, iterator
        int k = 0;  //for temporary array, iterator

        // to add element in temporary array
        while(i <= mi && j <= ei){

            // for left part
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            // for right part
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // now if left part will left after comparison with right part
        while(i <= mi){
            
            // temp[k] = temp[i];
            // i++;
            // k++;
                // or 
            temp[k++] = arr[i++];
        }
        // now if right part will left after comparison with left part
        while(j <= ei){
            
            // temp[k] = temp[i];
            // i++;
            // k++;
                // or 
            temp[k++] = arr[j++];
        }

        // copy temporaray arr to orignal arr
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {6, 3, 9, 5, 2, 8, -4, -10, 1};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);                 
    }    
}