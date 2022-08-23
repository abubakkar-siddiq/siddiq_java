package sorting.mypackage;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		//turns
		for(int i=0; i<arr.length-1; i++) {
			int minPos = i;
			for(int j=i+1; j<arr.length; j++) {
				//if(arr[minPos] < arr[j]) { //decreasing order
				if(arr[minPos] > arr[j]) {	 //increasing order
					minPos = j;
				}
			}
			//swap
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 4, 1, 3, 2};
		selectionSort(arr);
		printArr(arr);

	}

}
