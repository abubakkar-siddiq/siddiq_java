package loops.mypackage;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		do {
			int n = sc.nextInt();
			if(n % 10 == 0) { //to find multiple of 10
				break;
			}
			System.out.println(n);
		}while(true);

	}

}
