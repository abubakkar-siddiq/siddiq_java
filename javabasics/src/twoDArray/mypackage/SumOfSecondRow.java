package twoDArray.mypackage;

public class SumOfSecondRow {
	
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
		
		int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
		
		printMatrix(nums);
		
		int sum = 0;
		
		//sum of 2nd row elements
		for(int j=0; j<nums[0].length; j++) {
			sum += nums[1][j];
		}
		
		System.out.println("sum of second row elements are: " + sum);

	}

}
