import java.util.Arrays;

public class shell_sort {
    public static void shellSort(int arr[]){
        int g = arr.length / 2;
        for(int gap = g; gap > 0; gap /= 2){
            for(int j = gap; j < arr.length; j++){
                int st = j;
                for(int i = st - gap; arr[i] > arr[st] && i >= 0; i = i - gap ){
                    int temp = arr[i];
                    arr[i] = arr[st];
                    arr[st] = temp;
                    st = i;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {29, 35, 4, 7, 49, 8, 2, 5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }   
}
