package twoPointers;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mamadamam";
		boolean res = isPalindrome(s);
		System.out.println(res);

	}
	
	public static boolean isPalindrome(String s) {
		int left =0, right = s.length()-1;
		
		while(left < right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
