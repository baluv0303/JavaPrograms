package seniorSDET;

import java.util.Arrays;

public class validAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "test" , t="estt";
		boolean value= validAnagramsSort(s,t);
		System.out.println(value);

	}
	
	public static boolean validAnagrams(String s, String t) {
		int[] a = new int[26];
		for(int i=0; i< s.length(); i++) {
			a[s.charAt(i)-'a']++;
		}
		for(int i=0; i< t.length(); i++) {
			a[s.charAt(i)-'a']--;
		}
		
		for(int i : a) 
			if(i!=0) 
				return false;
			
			return true;
			
//			Time complexity O(n)
//			Space complexity O(1)
		}
	
	public static boolean validAnagramsSort(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(new String(a).equals(new String(b))) return true;
		return false;
		
	}
}
