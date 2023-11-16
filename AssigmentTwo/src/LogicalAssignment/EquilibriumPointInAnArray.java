package LogicalAssignment;

public class EquilibriumPointInAnArray {

	public static int equilibriumPoint(long[] arr,int n) {
		long sum=0;
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			
		}
		long leftSum=0;
		for(int i=0;i<n;i++) {
			sum=sum-arr[i];
			if( leftSum == sum) {
				return i;
			}
			leftSum = leftSum + arr[i];
		}
		return -1;
		
	}
	public static void main(String[] args) {
		long[] arr = {1,3,5,2,2};
		int n = arr.length;
		equilibriumPoint(arr,n);
	}

}
