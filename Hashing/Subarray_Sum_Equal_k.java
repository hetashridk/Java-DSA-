import java.util.HashMap;
public class Subarray_Sum_Equal_k {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;
        int k = -10;

        for(int j = 0; j < arr.length; j++){
            sum = sum + arr[j];  //sum(j)

            if(map.containsKey(sum - k)){
                count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("The number of subarray whose sum is equal to " + k + " is " + count);
    }
}
