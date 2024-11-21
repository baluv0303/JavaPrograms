package seniorSDET;

public class compressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compressStringCharacters("aaawwwweeeeeeooooooo");

	}

	public static void compressStringCharacters(String s) {
		
		StringBuilder cs = new StringBuilder();
		
		int count =1;
		
		for(int i=1; i< s.length();i++) {
			if(s.charAt(i)== s.charAt(i-1)) {
				count++;
				
			}
			else {
				cs.append(s.charAt(i-1));
				cs.append(count);
				count =1;
			}
		}
		
		cs.append(s.charAt(s.length()-1));
		cs.append(count);
		
		System.out.println(cs.toString());
		
	}

}
