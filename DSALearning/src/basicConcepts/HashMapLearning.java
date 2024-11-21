package basicConcepts;

import java.util.HashMap;

public class HashMapLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<String, Integer>  hm= new HashMap<>();
		 
		 hm.put("Apple", 10);
		 hm.put("banana", 12);
		 hm.put("orange", 4);
		 
		 System.out.println(hm);
		 
		System.out.println("apple: " + hm.get("Apple"));
		
		if(hm.containsKey("banana")) {
			System.out.println("Banana is there in hashmap");
		}
		 
		//print key set
		
		for(String i : hm.keySet()) {
			System.out.println(i);
			
		}
		
		//print values
		
		for (int n : hm.values()) {
			System.out.println(n);
		}
		
		//Retrieve key and values from hashmap
		
		for (String s : hm.keySet()) {
			System.out.println("Key is " + s + " Value is "+ hm.get(s));
		}

	}

}
