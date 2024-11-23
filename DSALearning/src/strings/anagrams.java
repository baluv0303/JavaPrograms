package strings;

import java.util.HashMap;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "new";
		String s2 = "enw";
		
		boolean result = isValidAnagram(s1,s2);
		System.out.println(result);
		
		boolean result2 = isValidAnagramUsingHashMap(s1,s2);
		
		System.out.println(result2);

	}
	
	public static boolean isValidAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] count = new int[256];
		
		for(int i=0; i< s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for (int i=0; i<256 ; i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static boolean isValidAnagramUsingHashMap(String s1, String s2) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char c : s1.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(char c : s2.toCharArray()) {
			if(!hm.containsKey(c)) {
				return false;
			}
			
			hm.put(c, hm.get(c)-1);
			
			if(hm.get(c)==0) {
				hm.remove(c);
			}
		}
		return true;
	}

}
