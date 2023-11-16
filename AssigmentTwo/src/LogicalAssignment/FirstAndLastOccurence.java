package LogicalAssignment;

import java.util.List;

public class FirstAndLastOccurence {

	public static int[] firstAndLast(int[] arr, int N, int  X){
		
		int[] result = new int[2];
		result[0]=-1;
		result[1]=-1;
		
		for(int i=0;i<N;i++) {
			if(arr[i]==X) {
				if(result[0]==-1) {
					result[0]=i;
				}
				result[1]=i;
			}
		}
		
		return result;
		
	}
	public static void main(String[] args) {

		int[] arr = {1,3,3,3,4};
	    int N = arr.length;
	    int X=3;
	    firstAndLast(arr,N,X);
	}

}
