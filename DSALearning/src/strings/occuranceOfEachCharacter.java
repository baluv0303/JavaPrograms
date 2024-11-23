package strings;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbrr";
		calculateOccuranceOfEachCharacter(s);
		getOccurance(s);

	}
	
	public static void calculateOccuranceOfEachCharacter(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i< s.length(); i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public static void getOccurance(String s) {
		int[] count = new int[256];
		
		for(char c : s.toCharArray()) {
			count[c]++;
		}
		
		for(int i=0; i<256 ; i++) {
			if(count[i]>0) {
				System.out.println((char)i + " is appeared " + count[i]+ " time in given string");
			}
		}
 		
	}

}
