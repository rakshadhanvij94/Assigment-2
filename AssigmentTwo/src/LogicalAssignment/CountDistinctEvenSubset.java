package LogicalAssignment;

import java.util.HashSet;

public class CountDistinctEvenSubset {

	
	public static int countSubsets(int[] a,int n) {
		
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for(int i=0;i<n ;i++) {
			if(a[i]%2==0) {
				set.add(a[i]);
			}
		}
		
		int sizeEven = set.size();
		
		count= (int) Math.pow(2, sizeEven)-1;
		return count;
		
	}
	public static void main(String[] args) {

		int[] a = {4, 2, 1, 9, 2, 6, 5, 3};
		int n =  a.length;
		System.out.println(countSubsets(a,n));
		
	}

}
