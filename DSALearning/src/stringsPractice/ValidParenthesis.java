package stringsPractice;

import java.util.Stack;

public class ValidParenthesis {

    public static void main (String[] args){
        String s = "()[]{}";
        String t = "([)]";

        System.out.println(validParentheses(s));
        System.out.println(validParentheses(t));

    }



    public static boolean validParentheses(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }

            else {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(c == ')' && top != '(' || c =='}' && top != '{' || c == ']' && top != '['){
                    return false;
                }

            }
        }
        return st.isEmpty();
        // Time complexity = O(n)
        // Space co,plexity = O(n)
    }
}
