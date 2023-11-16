package LogicalAssignment;

import java.util.Scanner;

public class NthFibonacciNumber {

	
	public static long nthFibonacci(long n) {
		int a=0;
		int b=1;
		
		for(int i =1;i<n;i++) {
			int c = (a+b) % 1000000007;
			a=b;
			b=c;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Long value");
		Long n = sc.nextLong();
		nthFibonacci(n);
	}
}
