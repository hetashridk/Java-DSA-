public class rotated_sorted_array {
    public static int search(int arr[], int target, int si, int ei){

        // base case
        if(si > ei){
            return -1;    //element not found
        }


        // kaam
        int mi = si + (ei - si)/2;
        if(arr[mi] == target){
            return mi;
        }

        // on L1
        if(arr[si] <= arr[mi]){

            // case: a 
            if(arr[si] <= target && target <= arr[mi]){
                // for left
                return search(arr, target, si, mi - 1);
            }
            // case: b 
            else{
                // for right
                return search(arr, target, mi + 1, ei);
            }
        }
        // on L2
        else{

            // case: c 
            if(arr[mi] <= target && target <= arr[ei]){
                // for right
                return search(arr, target, mi + 1, ei);
            }
            // case:d
            else{
                // for left
                return search(arr, target, si, mi - 1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0, 0, arr.length - 1));
    }    
}