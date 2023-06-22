public class buy_sell_stock {
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;  //To calculate profit.
                maxProfit = Math.max(maxProfit, profit);   //aaj sudhin ma jetlu profit thayu hase te store karse
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7, 1, 5,  3, 6, 4};
        System.out.println("Maximun profit we get when we sell stock on day: " + buyAndSellStock(prices)); 
    }    
}