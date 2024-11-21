package seniorSDET;

import java.util.HashMap;
import java.util.Map;

public class characterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "mounikareddy";
		
		char[] ch = s.toCharArray();
	
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(Character c : ch) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Character print : hm.keySet()) {
			System.out.println(print + ": "+ hm.get(print));
		}
		
		for (int i=0; i< s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				int count = hm.get(s.charAt(i));
				hm.put(s.charAt(i), ++count);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
	}

}
