package seniorSDET;

public class findFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "geeksforgeeks";
        char result = findFirstNonRepeatedCharacterInString(input);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }

	}
	
	public static char findFirstNonRepeatedCharacterInString(String s) {
		
		int[] charCount = new int[26];
		
		for(int i=0; i< s.length(); i++) {
			charCount[s.charAt(i)-'a']++;
		}
		
		for (int i=0; i< s.length(); i++) {
			if(charCount[s.charAt(i)-'a']==1) {
				System.out.println(s.charAt(i));
				 return s.charAt(i); 
			}
		}
		
		return '\0';
	}

}
