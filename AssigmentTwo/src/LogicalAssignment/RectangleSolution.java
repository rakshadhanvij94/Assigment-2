package LogicalAssignment;

public class RectangleSolution {

	 public static int calculate_Area(int[][] arr,int n) {
		int maxArea = 0;
		 for(int i=0;i<n;i++) {
			 Rectangle rect = new Rectangle(arr[i][0],arr[i][1]);
			 int currentArea=rect.area();
			 if(currentArea>maxArea) {
				 maxArea= currentArea;
			 }
		 }
		return maxArea;
	 }
	 
	 public static void main(String[] args) {

			int[][] a = {{1,2},{3,4},{5,6},{7,8}};
			int n =  a.length;
			System.out.println(calculate_Area(a,n));
			
		}

}
