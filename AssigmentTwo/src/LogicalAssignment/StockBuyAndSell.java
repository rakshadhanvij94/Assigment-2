package LogicalAssignment;

import java.util.ArrayList;

public class StockBuyAndSell {

	public ArrayList<ArrayList<Integer>> stockBuySell(int[] prices,int n){
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		int buy = 0,sell=0;
		
		for(int i=0;i<n-1;i++) {
			
		if(prices[i+1]>prices[i]) {
			sell++;
		} else if(sell>buy) {
			ArrayList<Integer> l1= new ArrayList<Integer>();
			l1.add(buy);
			l1.add(sell);
			ans.add(l1);
		}
		buy=i+1;
		sell=i+1;
		}
		if(sell>buy) {
			ArrayList<Integer> l1= new ArrayList<Integer>();
			l1.add(buy);
			l1.add(sell);
			ans.add(l1);
		}
		return ans;
	}
	public static void main(String[] args) {

		
	}

}
