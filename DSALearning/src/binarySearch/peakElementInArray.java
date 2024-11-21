package binarySearch;

public class peakElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 12, 2, 4, 1};
        
        int peak = findPeakElement(arr);
        System.out.println("Peak element found at index: " + peak);

	}

	public static int findPeakElement(int[] arr) {
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			int mid = left + (right-left)/2;
			if(arr[mid]<arr[mid+1]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return left;
	}
}
// Time complexity o(log n)
//space complexity o(1)
