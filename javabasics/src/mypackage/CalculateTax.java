package mypackage;

import java.util.Scanner;

public class CalculateTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income");
		int income = sc.nextInt();
		
		int tax;
		
		if(income < 500000) {
			tax = 0;
		}
		else if(income >= 500000 && income <1000000) {
			tax = (int)(income * 0.2); //type casting
		}
		else {
			tax = (int)(income * 0.3);
		}
		
		
		System.out.println("Your tax is : "+ tax);

	}

}
