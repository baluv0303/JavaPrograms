package twoPointers;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Balaji Reddy" ;
		
	System.out.println(reverseGivenString(s));

	}

	public static String reverseGivenString(String s) {
		 char[] arr = s.toCharArray();
		int left = 0, right = arr.length-1;
		while(left<right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		
		return new String(arr);
	}
}
