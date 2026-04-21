package stringsPractice;

public class LongestPalindrome {

    public static void main(String[] args){
        String s = "racecar";
        String t= "mynanymeisbalu";

        System.out.println(longestPalindromeBruteforce(s));
        System.out.println(longestPalindromeBruteforce(t));

    }

    public static String longestPalindromeExpand(String s){
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i=0; i<s.length(); i++){
            int len1 = expand(s, i, i);
            int le2 = expand(s, i, i+1);
            int len = Math.max(len1, le2);

            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }

        }
        return s.substring(start,end+1);

        // Time complexity = O(n3=2)
        // Space complexity = O(1)
    }

    public static int expand(String s , int left, int right){
            while (left <=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left --;
                right ++;
            }
            return right-left-1;
    }

    public static String longestPalindromeBruteforce(String s){
        if(s== null || s.length() < 1) return "";

        String maxPalindrome ="";
        int maxLength = 0, n = s.length();

        for(int i=0; i< n ; i++){
            for(int j=i+1; j<n ; j++){
                String sub =s.substring(i, j+1);

                if(sub.length() > maxLength && isPalindrome(sub)){
                    maxLength = sub.length();
                    maxPalindrome = sub;
                }
            }

        }

        return maxPalindrome;

        // Time complexity = O(n3)
        // Space complexity = O(1)

    }

    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left ++;
            right --;
         }
        return true;
    }
}
