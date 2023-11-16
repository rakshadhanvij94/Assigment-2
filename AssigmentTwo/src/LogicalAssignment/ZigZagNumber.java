package LogicalAssignment;

public class ZigZagNumber {

	public static void zigZag(int[] a, int n) {
		boolean flag = true;
		for (int i = 0; i < n - 1; i++) {
			if (flag && a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			if (!flag && a[i] < a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			System.out.println(a[i + 1]);
			flag = !flag;
		}

	}
	public static void main(String[] args) {
		int[] a = {4, 2, 1 ,5,3};
		int n =  a.length;
		zigZag(a,n);
		
	}

}
