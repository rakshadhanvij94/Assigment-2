package LogicalAssignment;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

	public static int getPairsCount(int[] arr,int n,int k) {
		int count = 0;
		Map<Integer,Integer > map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			int compliment = k-arr[i];
			if(map.containsKey(compliment)) {
			count = count + map.get(compliment);
			}
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,7,1};
		int n = arr.length;
		int k=6;
		
		getPairsCount(arr,n,k);
		
	}

}
