public class heapSort {

    public static void heapify(int arr[], int i, int n){
        //  n = size
        int left = 2*i + 1;
        int right = 2*i + 2;
        int max = i;

        if(left < n && arr[left] > arr[max]){
            max = left;
        }

        if(right < n && arr[right] > arr[max]){
            max = right;
        }

        while(max != i){
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(arr, max, n);
        }
    }
    public static void HeapSort(int arr[]){

        // step 1:- buil maxHeap
        int n = arr.length;
        for(int i = n / 2; i > 0; i--){
            heapify(arr, i, n);
        }

        // step 2:- push largest at end
        for(int i = n - 1; i > 0; i--){
            // swap 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 10, 1, 5, 3};
        HeapSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();


    }
}
