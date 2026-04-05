package arrays;

public class bestTimeToBuyAndSellStocks {

    public static void main(String[] args){
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfitBruteforce(prices));
        System.out.println(maxProfitMinimumPrice(prices));
    }

    public static int maxProfitBruteforce(int[] prices){
        int maxProfit = 0;

        for(int i=0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                maxProfit= Math.max(maxProfit, prices[j]-prices[i]);
            }
        }

        return maxProfit;

//        Time: O(n²)
//        Space: O(1)
    }

    public static int maxProfitMinimumPrice(int[] prices){
        int minPrice= Integer.MAX_VALUE, maxprofit=0;

        for(int price : prices){
            if(minPrice > price){
                minPrice=price;
            } else  {
                int profit = price -minPrice;
                maxprofit = Math.max(maxprofit, profit);

            }
        }
        return  maxprofit;
    }

//    Time = 0(n)
//    Space = 0(1)

}
