public class backtracking {

    // to print array
    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int value){

        // base case
        if(i == arr.length){
            printArray(arr);
            return;
        }

        // kaam
        arr[i] = value;
        changeArr(arr, i + 1, value + 1);

        // backtracking step
        arr[i] = arr[i] - 2;
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);
    }    
}