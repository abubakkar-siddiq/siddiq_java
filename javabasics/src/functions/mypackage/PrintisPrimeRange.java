package functions.mypackage;


public class PrintisPrimeRange {
	
	public static boolean isPrime(int n) {
		//corner case
		if(n == 2) {
			return true;
		}
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primesInRange(int n) {
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) { //true
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		primesInRange(20);
		

	}

}
