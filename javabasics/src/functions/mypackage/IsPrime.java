package functions.mypackage;

public class IsPrime {
	
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i=2; i<=n-1; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(20));

	}

}
