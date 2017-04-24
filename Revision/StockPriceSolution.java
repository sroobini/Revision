package com.example.helloworld.icebreakers;

/**
 * Created by IceBreakers on 3/4/17.
 *
 Say you have an array for which the i element is the price of a given stock on day i.
 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 design an algorithm to find the
 maximum profit.
 Example 1:
 ----------
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5
 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 ----------
 Input: [7, 6, 4, 3, 1]
 Output: 0
 In this case, no transaction is done, i.e. max profit = 0.
 */

public class StockPriceSolution {

    private static int maxProfit(int[] prices){
        if(prices == null){
            return 0;
        }
        if(prices.length <= 1){
            return 0;
        }

        int min = 0;
        int maxProft = 0;
        for(int curr = 1; curr < prices.length; curr++){
            int diff = prices[curr] - prices[min];
            if(maxProft < diff){
                maxProft = diff;
            }
            if(prices[min] > prices[curr]){
                min = curr;
            }
        }
        return maxProft;
    }

    public static void testBench(){
        //null case
        // 1 element case
        // multiple elements case
        int[] test1 = {7,1,4,5,6,2};
        System.out.println(maxProfit(test1));


        int[] test2 = {7,6,5,4};
        System.out.println(maxProfit(test2));

    }
    public static void main(String args[]){
        testBench();
    }
}
