package loops.mypackage;

public class PrintReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n = 10899;
		
		while(n > 0) {
			int lastDigit = n % 10;
			System.out.print(lastDigit);
			n = n / 10;
		}
		
		System.out.println();

	}

}
