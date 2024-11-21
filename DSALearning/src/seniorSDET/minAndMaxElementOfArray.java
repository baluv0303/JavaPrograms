package seniorSDET;

public class minAndMaxElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {98,4,65,8,9,};
		minAndMaxOfArray(num);

	}
	
	public static void minAndMaxOfArray(int nums[]) {
		
		int n = nums.length;
		int max = nums[0];
		int min = nums[0];
		
		for (int i=0; i< n; i++) {
			if (nums[i]>max) {
				max = nums[i];
			}
		}
		
		System.out.println("Maxium number in the array is " + max);
		
		for (int i=0; i< n; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println(min);
		
		}

	
}
