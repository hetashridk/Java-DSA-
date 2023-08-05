import java.util.Arrays;

public class merge_sort1 {
        // to print array
        public static void printArray(int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static int[] mergeSort(int arr[]){
            // base case
            if(arr.length == 1){
                return arr;
            }

            int mi = arr.length / 2;

            int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mi));
            int right[] = mergeSort(Arrays.copyOfRange(arr, mi, arr.length));
            
            return merge(left, right);

        }

        public static int[] merge(int first[], int second[]){
            int temp[] = new int[first.length + second.length];

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < first.length && j < second.length){
                if(first[i] < second[j]){
                    temp[k] = first[i];
                    i++;
                }
                else{
                    temp[k] = second[j];
                    j++;
                }
                k++;
            }

            while (i < first.length) {
                temp[k] = first[i];
                i++;
                k++;
            }

            while (j < second.length) {
                temp[k] = second[j];
                j++;
                k++;
            }

            return temp;
        }

        public static void main(String[] args) {
            int arr[] = {6, 3, 9, 5, 2, 8, -4, -10, 1};
            arr = mergeSort(arr); 
            printArray(arr);
        }
}
