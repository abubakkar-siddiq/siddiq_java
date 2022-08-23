package twoDArray.mypackage;

import java.util.Scanner;

public class Creating2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = new int[3][3];
		int n = matrix.length, m = matrix[0].length;
		
		Scanner sc = new Scanner(System.in);
		//input
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
