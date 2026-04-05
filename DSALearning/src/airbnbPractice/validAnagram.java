package airbnbPractice;

public class validAnagram {

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){
        s=s.replaceAll("\\s","").toLowerCase();
        t= t.replaceAll("\\s","").toLowerCase();

        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i=0; i< s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
