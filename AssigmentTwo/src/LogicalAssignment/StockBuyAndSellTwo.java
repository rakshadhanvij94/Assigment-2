package LogicalAssignment;

public class StockBuyAndSellTwo {
	
public static int stockBuyAndSell(int[] prices) {
	int profit = 0;
	
	for(int i=1;i<prices.length;i++) {
		if(prices[i]>prices[i-1 ]) {
			profit = profit+ prices[i]-prices[i-1];
		}
	}
	return profit;
}
public static void main(String[] args) {
	int[] prices = {3,4,1,5};
    stockBuyAndSell(prices);
		
	}
}
