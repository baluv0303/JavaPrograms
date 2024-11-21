package seniorSDET;

import java.util.HashMap;
import java.util.Map;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "apple banana apple orange banana apple";
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] words = text.split(" ");
		
		for(String word : words) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			
			else {
				hm.put(word, 1);
			}
		}
		
		
		for(Map.Entry<String, Integer> entry : hm.entrySet() ) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
			
		}

	}

}
