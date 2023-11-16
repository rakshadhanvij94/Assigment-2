package LogicalAssignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static String is_palindrome(int number) {
		String s = Integer.toString(number);
		
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i) == (s.charAt(j))) {
				i++;
				j--;
			} else {
				return "No";
			}
		}
			return "Yes";
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a num");
		int N = sc.nextInt();
		is_palindrome(N);

	}

}
