import java.util.Arrays;
public class subsetSum {
    public static void findSubset(int[] arr, int ans, int sum, int i) {
        // base case
        if (sum == ans) {
            System.out.println("Subset found: " + Arrays.toString(arr));
            return;
        }
        else{
            System.out.println("not found");
        }

        // check if we have reached the end of the array
        if (i == arr.length) {
            return;
        }

        // choice for yes
        findSubset(arr, ans, sum + arr[i], i + 1);

        // choice for no
        findSubset(arr, ans, sum, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        int targetSum = 7;
        findSubset(arr, targetSum, 0, 0);
    }
}
