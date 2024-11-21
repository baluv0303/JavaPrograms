package seniorSDET;

public class largestProductOfTwoElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] nums = {1, 10, -5, 1, 100};  // Example array
        
        // Call the function to find the largest product
        int largestProduct = findLargestProduct(nums);
        
        System.out.println(largestProduct);

	}
	
	public static int findLargestProduct(int[] nums) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		int min1 = Integer.MIN_VALUE, min2 = Integer.MIN_VALUE;
		
		for(int num : nums) {
			if(num > max1) {
				max2 = max1;
				max1 = num;
			}
			else if (num > max2) {
				max2 = num;
				}
			
			if(num < min1) {
				min2 = min1;
				min1 = num;
			}
			else if (num < min2) {
				min2 = num;
				}
			
		}
		
		return Math.max((min1*min2), (max1*max2));
	}
	//Time complexity O(n)
	//Space complexity O(1)
}
