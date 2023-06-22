import java.util.*;
public class counting_sort {
    public static void countingSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // for frequency count
        // iterate on original array
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;  //number ne as a index levanu che and count ma ae index par javanu and ae number ne increase kari levanu i.e; ++
        }

        // sorting
        int  j = 0;
        // iterate on count array.
        for(int  i = 0; i < count.length; i++){
            while(count[i] > 0){    //jya sudhin count ni value 0 ni thy jai 
            arr[j] = i;      //tya sudhin original array ma number nakha jasu
            j++;      //original index ni vadharta jasu
            count[i]--;     //decrease to 2 to 1 and 1 to 0.

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
        countingSort(arr);

        System.out.print("Sorted array is: ");
        printArr(arr);                  
    }                     
       
}