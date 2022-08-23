package twoDArray.mypackage;

public class TransposeMatrix {
	
    public static void printMatrix(int nums[][]) {
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 2, col = 3;
		
		int[][] matrix= { {2,3,7}, {5,6,7} };
		
		//display original matrix
		printMatrix(matrix);
		
		//Transpose the matrix
		int[][] transpose = new int[col][row];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println();
		
		//display the transpose matrix
		printMatrix(transpose);

	}

}
