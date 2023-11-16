package LogicalAssignment;

import java.util.Scanner;

public class ConfusedPappu {

	public static int findDiff(int amount) {
		
		int extra = 0;
		
		while(amount>0) {
			
			int digit = amount%10;
			
			if(digit==6) {
				extra=extra*10+3;
			}else if(digit==9) {
				extra=extra*10-3;	
		    }else {
				extra=extra*10;
			}
			amount=amount/10;
		}
		return extra;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Amount");
		int amount = sc.nextInt();
		findDiff(amount);
	}

}
