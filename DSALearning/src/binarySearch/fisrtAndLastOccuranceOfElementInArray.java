package binarySearch;

public class fisrtAndLastOccuranceOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 2, 2, 3, 4, 5,5};
        int target = 5;
        
        int first = findFirstOccurance(arr, target);
        int last = findLastOccurance(arr, target);
        
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);

	}
	
	public static int findFirstOccurance(int[] arr, int target) {
		int left=0, right = arr.length-1, result =-1;
		
		while(left<=right) {
			int mid = left+ (right-left)/2;
			if(arr[mid]== target) {
				result = mid;
				right = mid-1;
			}
			else if(arr[mid] < target) {
				left = mid +1;
			}
			else {
				right = mid -1;
			}
		}
		return result;
	}

	public static int findLastOccurance(int[] arr, int target) {
		int left=0, right = arr.length-1, result =-1;
		
		while(left<=right) {
			int mid = left+ (right-left)/2;
			if(arr[mid]== target) {
				result = mid;
				left = mid+1;
			}
			else if(arr[mid] < target) {
				left = mid +1;
			}
			else {
				right = mid -1;
			}
		}
		return result;
	}
}
