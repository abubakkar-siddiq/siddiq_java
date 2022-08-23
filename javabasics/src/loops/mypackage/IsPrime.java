package loops.mypackage;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		
		if(n == 2) {
			System.out.println("n is prime");
		}else {
		boolean isPrinme = true;
		//for(int i=2; i<=n-1; i++) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrinme = false;
			}
		}
		
		if(isPrinme == true) {
			System.out.println("n is Prime");
		}else {
			System.out.println("n is not Prime");
		}

	}

	}
	
	
}
