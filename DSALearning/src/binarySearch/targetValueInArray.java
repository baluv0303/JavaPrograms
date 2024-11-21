package binarySearch;

public class targetValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        int result = findTargetValue(arr, target);

        if (result != -1) {
            System.out.println("Target found at index " + result);
        } else {
            System.out.println("Target not found");
        }

	}
	
	public static int findTargetValue(int[] arr, int tar) {
		
		int left=0, right = arr.length-1;
		
		while(left<=right) {
			int mid = left+ (right-left)/2;
			
			if(arr[mid]== tar) {
				return mid;
			}
			
			else if(arr[mid]< tar) {
				left = mid+1;
				}
			else {
				right=mid-1;
			}
		}
		 return -1;  
	}

}
