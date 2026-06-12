import java.lang.Math.*;

public class BuySellStock {

    // TC: O(N)  SC: O(1)
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] <min){
                min = prices[i];
            }
            else {
                maxProfit = Math.max(maxProfit,prices[i]-min);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
