public class binary_search {
    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length - 1;
        int mid = (start + end)/2;

        // Comparisons
        while(start <= end){

            // equal
            if(number[mid] == key){
                return mid;
            }

            //1st half
            // left
            if(number[mid] > key){
                end = mid - 1;
            }

            // 2md half
            //right
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2, 34, 43, 21, 67, 22, 64};
        int key = 21;
        System.out.println("index for key is: " + binarySearch(number, key));
    }    
}