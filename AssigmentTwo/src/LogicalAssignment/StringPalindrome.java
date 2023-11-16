package LogicalAssignment;

import java.util.Scanner;

public class StringPalindrome {

	public static int isPalindrome(String input) {
		
		String s = input.toLowerCase();
		int i =0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
			i++;
			j--;
			} else {
			return 0;	
			}
		}
		return 1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string");
		String input = sc.nextLine();
		isPalindrome(input);
	}
}
