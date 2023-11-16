package LogicalAssignment;

import java.util.HashMap;

public class UniqueNumberOfOccurences {

	public static boolean isFrequencyUnique(int[] arr) {
		
		HashMap<Integer, Integer> freq = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			freq.put(arr[i],
			freq.getOrDefault(arr[i], 0)+1);
		}
		HashMap<Integer, Integer> freqCount = new HashMap<>();
		
		for(int value : freq.values()) {
			freqCount.put(value,
			freqCount.getOrDefault(value, 0)+1);
		}
		
		for(int value : freqCount.values()) {
			if(value>1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		int[] arr = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
		isFrequencyUnique(arr);
	}

}
