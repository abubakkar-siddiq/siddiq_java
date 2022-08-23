package functions.mypackage;

import java.util.Scanner;

public class Factorial {
	
	public static int printFact(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		
		int fact = printFact(n);
		System.out.println("n! : "+fact);

	}

}
