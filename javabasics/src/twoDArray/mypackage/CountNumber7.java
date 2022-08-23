package twoDArray.mypackage;

public class CountNumber7 {
	
public static int printNumber7(int array[][]) {
		
		int countof7 = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(array[i][j] == 7) {
					countof7 ++;
				}
			}
		}
		System.out.println("count of 7 is : " + countof7);
		return countof7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[][] array = { {4,7,8},{8,8,7} };
		
		printNumber7(array);

	}

}
