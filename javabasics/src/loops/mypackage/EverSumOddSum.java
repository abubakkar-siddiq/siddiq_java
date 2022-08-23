package loops.mypackage;
import java.util.*;

public class EverSumOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		
		do {
			System.out.println("enter a number : ");
			int number = sc.nextInt();
			if(number % 2 == 0) {
				evenSum += number;
			}else {
				oddSum += number;
			}
			System.out.println("Do you want to continue press 1 for yes or 0 for no");
			
		    choice = sc.nextInt();
		}while(choice == 1);
		
		System.out.println("Sum of evern numbers : "+ evenSum );
		System.out.println("Sum of odd numbers : "+ oddSum);

	}

}
