package seniorSDET;

import java.util.Stack;

public class balancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()[{}()]";
		if(isValid(s)==true) {
			System.out.println("Valid Parenthesis ");
		}
		else {
			System.out.println("Invalid Parenthesis ");
		}

	}
	
	public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop(); 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }

}
