package seniorSDET;

public class missingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,5,6};
		
		System.out.println(missingNumber(nums));

	}
	
	public static int missingNumber(int[] nums) {
		int n = nums.length+1;
		int totalSum = n*(n+1)/2;
		int actualSum=0 ;
		
		for(int i=0; i< nums.length ; i++) {
			actualSum=actualSum+nums[i];
		}
		
		return totalSum-actualSum;
		
	}
//Time complexity O(n)
//Space complexity O(1)
}
