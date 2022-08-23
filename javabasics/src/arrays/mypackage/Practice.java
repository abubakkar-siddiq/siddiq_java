package arrays.mypackage;

import java.util.Scanner;

public class Practice {
	
	public static int linearSearch(int numbers[], int key) {
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int getLargest(int numbers[]) {
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			//largest
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
			//smallest
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("smallest number is : "+smallest);
		return largest;
		
	}
	
	public static int binarySearch(int numbers[], int key) {
		
		int start = 0, end = numbers.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(numbers[mid] == key) {
				return mid;
			}
			
			if(numbers[mid] < key) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
					
		}
		return -1;
	}
	
	public static void reverse(int numbers[]) {
		
		int first = 0, last = numbers.length-1;
		
		while(first < last) {
			//swap
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers[first] = temp;
			
			first++;
			last--;
		}
	}
	
	public static void printPairs(int numbers[]) {
		    int tp = 0; //total pairs
		    for(int i=0; i<numbers.length; i++) {
				int current = numbers[i];
				for(int j=i+1; j<numbers.length; j++) {
					System.out.print("("+current+","+numbers[j]+")");
					tp++;
				}
				System.out.println();
			}
		    System.out.println("total pairs = "+tp);
	}
	
	public static void printSubArray(int numbers[]) {
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i; j<numbers.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(numbers[k]+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int numbers[] = {2, 4, 6, 8, 10, 20};
		int key = 10;
		/*
		int index = linearSearch(numbers, key);
		if(index == -1) {
			System.out.println("not found");
		}else {
			System.out.println("key found at index : "+index);
		}
		*/
		
		//System.out.println("largest number is :"+getLargest(numbers));
		//System.out.println("key found at index : "+binarySearch(numbers, key));
		/*
		reverse(numbers);
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		*/
		//printPairs(numbers);
		printSubArray(numbers);
}
}