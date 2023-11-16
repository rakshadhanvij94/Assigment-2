package LogicalAssignment;

public class AddMinimumCharacters {

	public static int addMinChar(String str) {
		int n = str.length();

		int count = 0;

		for (int i = 0; i <= n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i-1)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
    String str = "ABA";
    addMinChar(str);
	}

}
