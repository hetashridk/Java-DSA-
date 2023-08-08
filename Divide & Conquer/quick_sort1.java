import java.util.Arrays;

public class quick_sort1 {

    public static void quickSort(int arr[], int low, int high){

        if(low >= high){
            return;
        }

        int si = low; 
        int ei = high;
        int mid = si + (ei - si)/2;

        int pivot = arr[mid];

        while(si <= ei){
            while(arr[si] < pivot){
                si++;
            }
            while(arr[ei] > pivot){
                ei--;
            }

            // now pivot is at correct position
            if(si <= ei){
                // swap
                int temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++;
                ei--;
            }
        }

        quickSort(arr, low, ei);
        quickSort(arr, si, high);
    }


    public static void main(String[] args) {
        int arr[] = {310, 285, 179, 652, 351, 423, 861, 254, 450, 520};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
