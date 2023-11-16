package LogicalAssignment;

import java.util.Scanner;

public class FibonacciSeriesUptoNthTerm {

	public static void Series(long N) {
		int a= 0;
		int b=1;
		System.out.println(a+" ");
		for(int i=1;i<=N;i++) {
		System.out.println(b+" ");
		int c= a+b;
		a=b;
		b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Long value");
		Long n = sc.nextLong();
		Series(n);
	}

}
