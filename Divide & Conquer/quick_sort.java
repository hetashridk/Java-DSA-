public class quick_sort {

     // to print array
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // to sort array
    public static void quickSort(int arr[], int si, int ei){

        // base case
        if(si >= ei){
            return;
        }

        // kaam
        int pivotIndex = partition(arr, si, ei);

        // for left
        quickSort(arr, si, pivotIndex - 1);

        // for right
        quickSort(arr, pivotIndex + 1, ei);
    }


    // to bring smaller element before pivot and larger element after pivot 
    // partition
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // for pivot element 
         i++;

        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0 , arr.length - 1);
        printArray(arr);

    }    
}