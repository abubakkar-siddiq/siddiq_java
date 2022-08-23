package arrays.mypackage;

public class binarySearch {
	
	public static int binSearch(int numbers[], int key) {
		
		int start = 0, end = numbers.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			//comparisions
			if(numbers[mid] == key) {//found
				return mid;
			}
			if(numbers[mid] < key) {//right
				start = mid+1;
			}else {//left
				end = mid-1;
			}
		}
		return -1;//key doesn't exist in our array
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2, 4, 6, 8, 10, 12};
		int key = 1;
		
		System.out.println("index for key is : "+binSearch(numbers, key));

	}

}
