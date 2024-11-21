package seniorSDET;

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
        if (isPerfect(n))
            System.out.println(n + " is a perfect number");
        else
            System.out.println(
                n + " is not a perfect number");
	}
	
	public static boolean isPerfect(int n) {
		if(n==1) {
			return false;
		}
		int sum = 1;
		for(int i=2; i<n;i++) {
			if(n%i ==0) {
				sum= sum+i;
			}	
		}
		if (sum==n) 
				return true;
		return false;
		
	}

}
//Time Complexity: O(n)
