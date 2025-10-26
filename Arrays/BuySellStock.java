//This code computes the maximum profit can be made by buying & selling stocks
import java.util.*;

public class BuySellStock {
    public static void maxProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            //Case when Buy Price < Sell Price, sell the stock
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //Today's profit
                MaxProfit = Math.max(MaxProfit, profit);    //global profit
            }
            //Otherwise update buy price to sell price
            else{
                buyPrice = prices[i];
            }
        }

        System.out.println("Maximum profit: " + MaxProfit);
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        maxProfit(prices);
    }
}
