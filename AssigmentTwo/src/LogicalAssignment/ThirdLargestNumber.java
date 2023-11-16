package LogicalAssignment;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static int thirLargest(int a[], int n) {
		
		if(n<3) {
			return -1;
		}
		
		Arrays.sort(a);
		
		return a[2];
		
	}
	public static void main(String[] args) {
    int[] a = {10,2};
    int n = a.length;
    thirLargest(a,n);
}
		
	}

