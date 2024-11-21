package test;

public class occuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Balaji";
		countCharacterOccurance(input);

	}

	public static void countCharacterOccurance(String input) {
		int[] counts = new int[256];
		
		for(int i=0; i< input.length(); i++) {
			counts[input.charAt(i)]++;
		}
		
		for(int i=0; i< counts.length; i++) {
			if(counts[i]>0) {
				System.out.println((char)i + " "+ counts[i]);
			}
		}
	}
}
