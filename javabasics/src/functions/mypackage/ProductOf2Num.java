package functions.mypackage;

public class ProductOf2Num {
	
	public static int multiply(int a, int b) {
		int product = a * b;
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		int prod = multiply(a, b);
		System.out.println("product of a * b : "+ prod);
		
		prod = multiply(20, 30);
		System.out.println("product of a * b : "+ prod);

	}

}
