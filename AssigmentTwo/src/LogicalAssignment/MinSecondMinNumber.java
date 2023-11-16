package LogicalAssignment;

import java.util.Vector;

public class MinSecondMinNumber {

	public static Vector<Integer> minAnd2ndMin(int[] A , int N){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		Vector<Integer> result = new Vector<Integer>();
		for(int i = 0;i<N;i++) {
			if(A[i]<smallest) {
				secondSmallest = smallest;
				smallest = A[i];
			} else if(A[i] < secondSmallest && A[i]!=smallest) {
				secondSmallest=A[i];
			}
			
		}
		 if(smallest != Integer.MAX_VALUE && secondSmallest != Integer.MAX_VALUE) {
			 result.add(smallest);
			 result.add(secondSmallest);
		 }
		
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] A = { 5 ,2, 4, 3, 5, 6};
		int N = A.length;
		minAnd2ndMin(A,N);
	}

}
