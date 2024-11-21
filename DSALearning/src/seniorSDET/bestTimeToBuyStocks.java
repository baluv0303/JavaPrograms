package seniorSDET;

public class bestTimeToBuyStocks {
	
//	Input: prices = [7,1,5,3,6,4]
//			Output: 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}
	
	public static int maxProfit(int[] prices) {
		int buy = prices[0], maxProfit=0;
		for(int i=0; i< prices.length;i++) {
			if(prices[i]<buy) {
				buy = prices[i];
			}
			
			else if(prices[i]-buy > maxProfit) {
				maxProfit= prices[i]-buy;
			}
		}
		
		return maxProfit;
		
		
	}
}
