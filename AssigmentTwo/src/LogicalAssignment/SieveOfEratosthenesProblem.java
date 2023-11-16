package LogicalAssignment;

public class SieveOfEratosthenesProblem {

	public static void SieveOfEratosthenes(int N) {
		boolean prime[] = new boolean[N+1];
		for(int i=0;i<=N;i++) 
			prime[i]=true;
		
		for(int p=2;p<=N;p++) {
			if(prime[p]==true) {
				System.out.println(p + " ");
				for(int i=p*p;i<=N;i+=p) {
					prime[i]=false;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		SieveOfEratosthenes(10);
	}

}
