package Week1;
//      https://leetcode.com/problems/valid-parentheses/description/


import java.util.Stack;

public class ValidParenthesis {
    class Solution {
        public boolean isValid(String s) {
            if(s.length() %2 != 0) {
                return false;
            }
    
            Stack<Character> stack = new Stack<>();
    
            for(char ch : s.toCharArray()) {
                if(ch == '{') stack.push('}');
                else if(ch == '[')  stack.push(']');
                else if(ch == '(')  stack.push(')');
                else if(stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
    
            if(stack.isEmpty()) return true;
            return false;
        }
    }
}


// TC = 0(n) = for traversal
// SC = 0(n) = stack space

