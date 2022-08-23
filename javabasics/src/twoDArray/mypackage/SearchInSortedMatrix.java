package twoDArray.mypackage;

public class SearchInSortedMatrix {
	
	public static boolean staircaseSearch(int matrix[][], int key) {
		
		int row = 0, col = matrix[0].length-1; //(row, col)-->(0, m-1)
		while(row < matrix.length && col >= 0) { //(row=0 to n-1 && col=m-1 to 0)
			if(matrix[row][col] == key) {
				System.out.println("key found at (" + row + "," + col + ")");
				return true;
			}
			else if(key < matrix[row][col]) {
				col--;
			}else {
				row++;
			}
			
		}
		System.out.println("key Not found");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		int key = 33;
		staircaseSearch(matrix, key);

	}

}
