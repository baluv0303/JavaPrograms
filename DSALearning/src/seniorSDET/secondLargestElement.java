package seniorSDET;

public class secondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,8,10,22,2};
		System.out.println(secondMax(arr));

	}
	
	public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
            else if(arr[i] < max && arr[i] > secondMax) {
            	secondMax = arr[i];
            }
		}
		return secondMax;
		
	}

}
