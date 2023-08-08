import java.util.Arrays;

public class shell_sort {
    public static void shellSort(int arr[]){
        int ig = arr.length / 2;
        for(int gap = ig; gap > 0; gap /= 2){
            for(int st = gap; st < arr.length; st++){
                int start = st;
                for(int jump = start - gap; arr[jump] > arr[start] && jump >= 0; jump = jump - gap ){
                    int temp = arr[jump];
                    arr[jump] = arr[start];
                    arr[start] = temp;
                    start = jump;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, 5, 2, 4, 8, 7};
        shellSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }   
}
