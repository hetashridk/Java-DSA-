public class TargetSumTabulation {
    public static boolean targetSum(int numbers[], int sum){
        int n = numbers.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        //intializing or base case or meaning
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = true;
        }
        for(int i = 0; i < sum + 1; i++){
            dp[0][i] = false;
        }

        // i = items and j = target sum
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < sum + 1; j++){
                // include
                if(numbers[i - 1] <= j && dp[i - 1][j - numbers[i - 1]] == true){
                    dp[i][j] = true;
                }
                else if(dp[i - 1][j] == true){
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }
    public static void main(String[] args) {
        int numbers[] = {4, 2, 7, 1, 3};
        int targetSum = 10;
        System.out.println(targetSum(numbers, targetSum));
    }
}
