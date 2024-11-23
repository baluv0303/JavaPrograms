package strings;

import java.util.LinkedHashSet;

public class removeDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baalllaajhgfhg";
		System.out.println(removeDuplicates(s));
		System.out.println(removeUsingLinkedHashSet(s));

	}
	
	public static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		boolean[] seen = new boolean[256];
		for(int i=0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if(!seen[ch]) {
				sb.append(ch);
				seen[ch]=true;
			}
		}
		
		return sb.toString();
	}
	
	public static String removeUsingLinkedHashSet(String s) {
		
		LinkedHashSet<Character> seen = new LinkedHashSet<>();
		
		StringBuilder result = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			
			seen.add(c);
		}
		
		for(char c: seen) {
			result.append(c);
		}
		
		return result.toString();
		
	}

}
