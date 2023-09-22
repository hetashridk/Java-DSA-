public class ZeroOneKnapsackTabulation {
    public static int knapsack(int wt[], int val[], int W){
        int n = val.length;

        int dp[][] = new int[n + 1][W + 1];

        //intializing 0 for base case
        for(int i = 0; i < dp.length; i++){   //col
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){ //row
            dp[0][j] = 0;
        }
        

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < W + 1; j++){
                int v = val[i - 1];
                int w = wt[i - 1];

                //valid
                if(j >= w){

                    // include
                    int include = val[i - 1] + dp[i - 1][j - w];

                    //exclude
                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);
                }
                //invalid
                else{
                    int exclude = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack(wt, val, W));
    }
}
