package LogicalAssignment;

public class MissingNumberInArray {

	public static int MissingNumber(int[] arr,int n) {
		int sum =0;
		for(int i =0;i<n-1;i++) {
			sum=sum+arr[i];
		}
		int expectedSum = n*(n+1)/2;
		return expectedSum-sum;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		int n = arr.length;
		MissingNumber(arr,n);
	}
}
