package stringsPractice;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static void main(String[] args){
        String s1 = "cat";
        String s2 = "act";
        String s3 = "Mine";
        String s4 = "nine";

        System.out.println(isValidAnagramSorting(s1,s2));
        System.out.println(isValidAnagramHashmap(s1,s2));
        System.out.println(isValidAnagramSorting(s3,s4));
        System.out.println(isValidAnagramHashmap(s3,s4));


    }

    public static boolean isValidAnagramSorting(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }

    public static boolean isValidAnagramHashmap(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();

        for(char c : s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
           if(!countMap.containsKey(c)){
               return false;
           }

           countMap.put(c, countMap.get(c)-1);

           if(countMap.get(c) ==0){
               countMap.remove(c);
           }

        }
        return countMap.isEmpty();
        //complexity = O(n)
        //space = O(k) k is unique characters
    }

    public static boolean isAnagram(String s, String t){
        if(s.length()!= t.length()){
            return false;
        }

        int[] alphabet = new int[26];

        for(int i=0; i< s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i)- 'a']++;
        }

        for(int count : alphabet){
            if(count!=0){
                return false;
            }
        }
        return true;
    }



}


