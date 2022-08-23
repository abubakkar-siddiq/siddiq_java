package sorting.mypackage;

public class CountingSort {
	
	public static void countingSort(int arr[]) {
		//finding largest number
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			largest = Math.max(largest, arr[i]);
		}
		
		//creating count array
		int count[] = new int[largest+1]; //largest-->7, 1--->0
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		//sorting
		int j=0; //taking index for original array
		for(int i=0; i<count.length; i++) {
			while(count[i] > 0) { //count[i]-->value of index i
 				arr[j] = i; 
				j++; 
				count[i]--; 
			}
		}
	}
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 4, 1, 3, 2, 4,3 ,7};
		countingSort(arr);
		printArray(arr);

	}

}
