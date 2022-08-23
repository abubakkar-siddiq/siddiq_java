package strings.mypackage;

import java.util.Scanner;

public class CreatingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input
		String str = "siddiq";
		String str1 = new String("siddiq");
		
		
		
		//taking input from user
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter first name :");
		//String first = sc.next();
		//System.out.println("enter first name :");
		//String last = sc.nextLine();
		
		
		
		//conctination
		String firstName = "Abubakkar";
		String lastName = "Siddiq";
		String fullName = firstName + " " + lastName;
		
		
		
		//output
		System.out.println(fullName);
		
		
		
		//string length(number of characters)
		System.out.println(fullName.length());
		
		
		
		//string charAt method
		System.out.println(fullName.charAt(0));
		
		
		
		//to print each character
		for(int i=0; i<fullName.length(); i++) {
			System.out.print(fullName.charAt(i) + " ");
		}
		

	}

}
