package twoPointers;

import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "baaljaiada";

		System.out.println(findSubstring(s));
	}
	
	public static int findSubstring(String s) {
		int left =0, maxLenghth =0;
		
		HashSet<Character> hs = new HashSet<>();
		
		for(int right =0; right < s.length(); right++) {
			if(hs.contains(s.charAt(right))) {
				hs.remove(s.charAt(left));
				left++;
			}
			hs.add(s.charAt(right));
			maxLenghth = Math.max(maxLenghth, right-left+1);
		}
		return maxLenghth;
	}

}
