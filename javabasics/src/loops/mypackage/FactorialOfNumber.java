package loops.mypackage;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int number = sc.nextInt();
		
		int factorial = 1;
		//for(int i=number; i>0; i--) {
		for(int i=1; i<=number; i++) {
			factorial *= i;
		}
		System.out.println(factorial);

	}

}
