package stringsPractice;

import java.util.Stack;

public class ReverseWordsInString {

    public static void main(String[] args){
        String str = "  The sky  is  Blue  in colour  ";
       System.out.println(reverseWordsInStringBruteForce(str));
        System.out.println(reverseWordsInStringUsingStack(str));

    }

    public static String reverseWordsInStringUsingTwoPointers(String s){
        StringBuilder result = new StringBuilder();
        int i = s.length()-1;

        while (i>=0){
            while (i>=0 && s.charAt(i)==' ') i--;
            if(i<0) break;
            int j= i;
            while (i>0 && s.charAt(i)!=' ') i--;

            result.append(s.substring(i+1,j+1));

            if(i>0) result.append(" ");
        }
        return result.toString();
        //Time = O(n)
        //Space = O(1)

    }

    public static String reverseWordsInStringUsingStack(String str){
        Stack<String> stack = new Stack<>();
        int i =0, n = str.length();

        while (i < n) {
            while (i < n && str.charAt(i) == ' ') i++;

            if (i >= n) break;

            StringBuilder words = new StringBuilder();

            while (i<n && str.charAt(i) != ' '){
                words.append(str.charAt(i));
                i++;
            }
            stack.push(words.toString());

        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.pop());
            if(!stack.isEmpty()) result.append(" ");
        }

        return result.toString();

        //Time = O(n)
        //Space = O(n)

    }

    public static String reverseWordsInStringBruteForce(String str){

        String[] words = str.trim().split("\\s+");

        int left =0, right = words.length-1;

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);

        //Time = O(n)
        //Space = O(n)
    }
}
