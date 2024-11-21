package seniorSDET;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Balaji Reddy";
		reverse(s);

	}
	
	public static void reverse(String s) {
		
		StringBuilder str = new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			str.append(s.charAt(i));
		}
		String reversed= str.toString();
		System.out.println(reversed);
		
		//Time and space complexity O(n)
		
	}

}
