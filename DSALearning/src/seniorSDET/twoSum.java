package seniorSDET;

import java.util.HashMap;

public class twoSum {
//	Input: nums = [2,7,11,15], target = 9
//			Output: [0,1]
//			Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15,-2}; int target = 9;
		twoSumProblem(nums,target);
		
		 int[] result = twoSumHashMap(nums, target);
		 
		 if(result.length ==2) {
			 System.out.println(result[0] + "," + result[1] );
		 }
		 else {
			 System.out.println("No result found");
		 }
		
	}
	
	public static int[] twoSumProblem(int[] nums, int target) {
		for(int i=0; i< nums.length-1; i++) {
			for(int j=i+1; j<nums.length ; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
		
		//Time complexity is O(n2) and space complexity is O(1)
	}
	
	public static int[] twoSumHashMap(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i< nums.length; i++) {
			int rem = target - nums[i];
			
			if(hm.containsKey(rem)) {
				return new int[] {hm.get(rem), i};
			}
			
			hm.put(nums[i], i);
			
		}
		
		return new int[] {};
		
	}
	
	//Time complexity is O(n) and space complexity is O(1)

	
}
