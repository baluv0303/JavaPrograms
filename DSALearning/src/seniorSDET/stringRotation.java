package seniorSDET;

public class stringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result=isRotation("abc","cba");
		System.out.println(result);

	}
	
	public static boolean isRotation(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String s1s1 = s1 + s1;
		
		return s1s1.contains(s2);
	}

}
