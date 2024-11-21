package seniorSDET;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		System.out.println(isPalindrome(s));
		String reversed = isPalindromeWithReverse(s);
		System.out.println(reversed);
		if(reversed.equals(s)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
	}
	
	public static boolean isPalindrome(String s) {
		
		String clean=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int left=0, right = clean.length()-1;
		while(left<right) {
			if(clean.charAt(left)!= clean.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		//Time and space complexity O(n)
	}
	
	public static String isPalindromeWithReverse(String s) {
		
		StringBuilder str = new StringBuilder();
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				str.append(c);
			}
		}
		
		return str.toString().toLowerCase();
	}


}
