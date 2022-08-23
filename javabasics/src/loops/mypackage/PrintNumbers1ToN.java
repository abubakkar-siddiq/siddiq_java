package loops.mypackage;

import java.util.Scanner;

public class PrintNumbers1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		
		while(count <= n) {
			System.out.print(count);
			count++;
		}
		System.out.println();

	}

}
