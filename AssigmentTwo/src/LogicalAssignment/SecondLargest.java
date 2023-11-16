package LogicalAssignment;

import java.util.Arrays;

public class SecondLargest {

	public static int print2Largest(int[] arr,int n) {
		Arrays.sort(arr);
		int max = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=max) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		int n = arr.length;
		print2Largest(arr,n);
	}

}
