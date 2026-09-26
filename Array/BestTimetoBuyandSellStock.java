class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1 ; i < prices.length ;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}


// Initially use two loops but got time excceding error because of o(n^2)
// this is one of the optimal solution for now so used this 