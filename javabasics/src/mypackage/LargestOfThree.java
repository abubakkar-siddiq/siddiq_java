package mypackage;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20, c = 30;
		
		if((a >= b) && (a >= c)) {
			System.out.println("Largest is a");
		}
		else if(b >= c) {
			System.out.println("Largest is b");
		}
		else {
			System.out.println("Largest is c");
		}

	}

}
