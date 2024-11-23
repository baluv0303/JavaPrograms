package strings;

import java.util.Stack;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "balaji";
		System.out.println(reverse(s));
		System.out.println(reverseUsingStack(s));

	}
	
	public static String reverse(String s) {
		StringBuilder ns = new StringBuilder();
		
		for(int i=s.length()-1; i>=0; i--) {
			ns.append(s.charAt(i));
			
		}
		
		return ns.toString();
		
	}
	
	public static String reverseUsingStack(String s) {
		Stack<Character> st = new Stack<Character>();
		char[] ch = s.toCharArray();
		 for (char c : ch) {
			 st.push(c);
		 }
		 
		 StringBuilder reversed = new StringBuilder();
		 while(!st.empty()) {
			 reversed.append(st.pop());
		 }
		 
		 return reversed.toString();		
	}

}
