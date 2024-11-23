package strings;

public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		boolean isPalindrome = checkPalindrome(s);
		System.out.println(isPalindrome);
		

	}
	
	public static boolean checkPalindrome(String s) {
		
		int left =0, right= s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		
		return true;
		
	}
	
	//Reverse a string and check if initial string and reversed strings are equal, if equal 
	//given string is palindrome

}
