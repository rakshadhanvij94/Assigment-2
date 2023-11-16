package LogicalAssignment;

import java.util.Scanner;

public class PrimeNumber {

	public static int isPrime(int N) {
		
		if(N<2) {
			return 0;
		}
		
		if(N==2){
			return 1;	
		}
		
		if(N%2==0){
			return 0;
		}
		
		for(int i=3;i<=Math.sqrt(N);i+=2) {
			if(N%i==0){
				return 0;
			}	
		}
		return 1;
		
	}
	
	public static void main(String args[]) {
		
		
	}
}
