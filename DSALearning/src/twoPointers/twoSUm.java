package twoPointers;

public class twoSUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,5,6,9};
		int target = 14;
		boolean result = findTwoSum(nums,target);
		System.out.println(result);
	}
	
	public static boolean findTwoSum(int[] nums, int target) {
		
		int left = 0, right= nums.length-1;
		
		while(left<right) {
			int sum = nums[left]+nums[right];
			if (sum == target) {
				return true;
			}
			else if(sum < target) {
				left++;
			}
			else if(sum > target) {
				right--;
			}
			
		}
		return false;
		
//		O(n)
//		O(1)
//		
		
	}

}
