package seniorSDET;

public class reverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Indian";
		reverseWord(s);

	}
	
	public static void reverseWord(String s) {
		
		String[] str = s.split("\\s+");
		 StringBuilder reversed = new StringBuilder();
		
		for(int i=str.length-1;i>=0 ; i--) {
			reversed.append(str[i]);
			
			if(i>0) {
				reversed.append(" ");
			}
			}
		
		System.out.println(reversed.toString());
		
	}

}
