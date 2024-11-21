package seniorSDET;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbccddeeff";
		removeDuplicateCharacters(s);
		removeDuplicateCharactersUsingBoolean(s);
	}
	
	public static void removeDuplicateCharacters(String s) {
		Set<Character> hs = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i< s.length(); i++) {
			char currentChar = s.charAt(i);
			
			if(!hs.contains(currentChar)) {
				hs.add(currentChar);
				 result.append(currentChar);
			}
		}
		
		System.out.println("String after removing duplicates  " + result.toString());
		
	}
	
	public static void removeDuplicateCharactersUsingBoolean(String s) {
		boolean[] seen = new boolean[256];
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i< s.length(); i++) {
			char currentChar = s.charAt(i);
			
			if(!seen[currentChar]) {
				 result.append(currentChar);
				 seen[currentChar]=true;
			}
		}
		
		System.out.println("String after removing duplicates  " + result.toString());
		
	}

}
