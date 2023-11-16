package LogicalAssignment;

import java.util.Scanner;

public class FactorialOfNumber {

	public static int factorial(int N) {
		
		if(N==0 || N==1) {
			return 1;
		} else {
			return N*factorial(N-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a num");
		int N = sc.nextInt();
		factorial(N);
	}

}
