//  You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 

class BuySellStock{
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0,currentprofit;
        for(int i =0 ;i <prices.length;i++){
            if(prices[i]<min){ // check if the price is less than min
                min=prices[i]; // if yes then assign the price to min
            }
            currentprofit=prices[i]-min; // calculate the profit
            if(currentprofit>max){ // check if the profit is greater than max
                max=currentprofit; // if yes then assign the profit to max
            }
        }

        return max;
        
    }
}