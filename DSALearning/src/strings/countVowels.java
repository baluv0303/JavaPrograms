package strings;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baleiaododo";
		System.out.println(countVowlesInString(s));
		System.out.println(vowelCOunt(s));

	}
	
	public static int countVowlesInString(String s) {
		int vowelsCount=0;
		
		char[] ch = s.toCharArray();
		for(char c : ch) {
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
			vowelsCount++;
		}
		}
		return vowelsCount;
	}
	
	public static int vowelCOunt(String s) {
		String vowels = "aeiouAEIOU";
		int count = 0;
		
		for (char c : s.toCharArray()) {
			if(vowels.indexOf(c)!= -1) {
				count++;
			}
		}
		
		return count;
		
	}

}
