package airbnbPractice;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringBruteforce(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }

    public  static int lengthOfLongestSubstringBruteforce(String s){
        int n = s.length();
        int maxLength = 0;

        for(int i=0; i<n ; i++){
            for (int j=i; j< n ; j++){
                HashSet<Character> hs = new HashSet<>();
                boolean isUnique=true;

                for(int k=i; k<= j; k++){
                    char ch = s.charAt(k);
                    if(hs.contains(ch)){
                        isUnique=false;
                        break;
                    }
                    hs.add(ch);
                }
                if(isUnique){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }

        return maxLength;
    }
}