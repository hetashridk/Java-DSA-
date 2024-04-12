public class RodCutting {
    public static int rodCutting(int len[], int price[], int rodLength){
        int n = price.length;

        int dp[][] = new int[n + 1][rodLength + 1];

        //intializing 0 for base case
        for(int i = 0; i < n + 1; i++){   //col
            dp[i][0] = 0;
        }
        for(int j = 0; j < rodLength + 1; j++){ //row
            dp[0][j] = 0;
        }
        

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < rodLength + 1; j++){

                //valid
                if(len[i - 1] <= j){

                    // include
                    int include = price[i - 1] + dp[i][j - len[i - 1]];

                    //exclude
                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);
                }
                //invalid
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int len[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;


        System.out.println(rodCutting(len, price, rodLength));
    }
}
