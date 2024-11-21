package seniorSDET;

public class longestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		System.out.println(longestUniqueSubstr(s));
		

	}
	
	public static int longestUniqueSubstrSlidingWindow(String s) {
		if (s.length()==0)
			return 0;
		if (s.length()==1)
			return 1;
		
		int left=0, right=0;
		int maxLength = 0;
		
		boolean[] visited= new boolean[256];
		while(right< s.length()) {
			while(visited[s.charAt(right)]) {
				visited[s.charAt(left)] = false;
				left++;
			}
			visited[s.charAt(right)]= true;
			
			maxLength = Math.max(maxLength, (right-left+1));
			right++;
		}
		return maxLength;
	}
	
	
	
	public static int longestUniqueSubstr(String s) {
		int n = s.length(), res=0;
		
		for(int i=0; i<n;i++) {
			boolean[] visited = new boolean[256];
			for(int j=i; j<n ; j++) {
				if(visited[s.charAt(j)]) {
					break;
				}
				
				else {
					res = Math.max(res, j-i+1);
					visited[s.charAt(j)]=true;
				}
			}
		}
		return res;
	}
//	Time Complexity: O(n^2) (due to the nested loops over the string).
//	Space Complexity: O(1) (due to the fixed-size visited[] array).


}
