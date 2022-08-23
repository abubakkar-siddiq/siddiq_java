package arrays.mypackage;

public class printPairs {
	
	public static void printPairs(int numbers[]) {
		int tp = 0;
		for(int i=0; i<numbers.length; i++) {
			int current = numbers[i];
			for(int j=i+1; j<numbers.length;j++) {
				System.out.print("("+current+","+numbers[j]+")");
				tp++;
			}
			System.out.println();			
		}
		System.out.println(tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2, 4, 6, 8, 10};
		printPairs(numbers);

	}

}
