package LogicalAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UniqueSubset {

	public static List<List<Integer>> allSubsetts(int[] arr,int n){
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i=0;i<(1<<n);i++) {
			
			List<Integer> subset = new ArrayList<>();
			for(int j=0;j<n;j++) {
				
				if((i&(1<<j))>0) {
					subset.add(arr[j]);
				}
			}
			
			Collections.sort(subset);
			if(!result.contains(subset)) {
				result.add(subset);
			}
		}
		return result;
		
	}
	public static void main(String[] args) {

		int[] arr1 = {2,1,2};
		
	    int n1 = arr1.length;
	    
	    System.out.println(allSubsetts(arr1,n1));
	    
        int[] arr2 = {1,2,3,3};
		
	    int n2 = arr2.length;
	    
	    System.out.println(allSubsetts(arr2,n1));
	}

}
