package arrays.mypackage;
import java.util.*;

public class LargestNumber {
	
	public static int getLargest(int numbers[]) {
		
		int largest = Integer.MIN_VALUE;
		//int smallest = Integer.MAX_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
			
			/*
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
			*/
		}
		
		//System.out.println("smallest number is : "+ smallest);
		return largest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {12, 23, 45, 11, 10};
		
		System.out.println("largest number is : "+ getLargest(numbers));
		

	}

}
