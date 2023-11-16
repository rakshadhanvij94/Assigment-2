package LogicalAssignment;

import java.util.Arrays;

public class KthSmallestElement {

	public static int kthSmallest(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[k-1];
		
	}
	public static void main(String[] args) {
		int[] arr = { 7 , 4 ,3 ,20 ,15};
		int k=3;
		
		kthSmallest(arr,k);
	}

}
