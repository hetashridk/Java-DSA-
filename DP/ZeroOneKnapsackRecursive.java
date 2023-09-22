public class ZeroOneKnapsackRecursive {
    public static int knapsack(int val[], int wt[], int W, int i){
        // base case
        if(i == 0 || W == 0){
            return 0;
        }

        // valid case
        if(W >= wt[i - 1]){
            
            // include
            int ans1 = val[i - 1] + knapsack(val, wt, W - wt[i - 1], i - 1);

            // exclude
            int ans2 = knapsack(val, wt, W, i - 1);

            return Math.max(ans1, ans2);
        }

        // invalid case
        else{

            // exclude
            return knapsack(val, wt, W, i - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(knapsack(val, wt, W, val.length));
    }
}
