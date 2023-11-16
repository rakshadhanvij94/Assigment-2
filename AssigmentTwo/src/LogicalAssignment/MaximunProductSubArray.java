package LogicalAssignment;

public class MaximunProductSubArray {

	public static int maxProduct(int[] nums) {
		int currentMax = nums[0];
		int currentMin = nums[0];
		int maxProduct = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			int temp = currentMax;
			
			currentMax = Math.max(Math.max(currentMax*nums[i], currentMin*nums[i]),nums[i]);
			
			currentMin = Math.min(Math.min(temp*nums[i], currentMin*nums[i]),nums[i]);
			
			maxProduct = Math.max(maxProduct,currentMax);
			
		}
		return maxProduct;
	}
	public static void main(String[] args) {
		int[] arr =  {2, 3, 4, 5, -1, 0};
		maxProduct(arr);
	}

}
