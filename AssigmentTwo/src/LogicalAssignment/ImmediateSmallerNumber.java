package LogicalAssignment;

public class ImmediateSmallerNumber {

	public static void immediateSmaller(int[] a,int n) {
		
		
		for(int i=0;i<n;i++) {
			int curr = -1;
	        if(i<n-1) {
	    	if(a[i+1] < a[i]) {
	    		curr=a[i+1];
	    	}
	    	System.out.println(curr);
	      }
		}
		
	}
	public static void main(String[] args) {

		int[] a = {4, 2, 1 ,5,3};
		int n =  a.length;
		immediateSmaller(a,n);
	}

}
