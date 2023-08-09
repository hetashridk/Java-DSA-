import java.util.Arrays;

public class insertion_sort1 {
    public static void insertionSort(int arr[]){
        for(int i = 0; i <= arr.length - 2; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    // swapp
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {98, 42, 1, -5, 10, 47, 20};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
