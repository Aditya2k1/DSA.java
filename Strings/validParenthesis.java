/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

EXAMPLE 1:
Input: s = "()"
Output: true

EXAMPLE 2:
Input: s = "()[]{}"
Output: true

EXAMPLE 3:
Input: s = "(]"
Output: false
*/

/* LeetCode Runtime: 3 ms, faster than 62.10% of Java online submissions for Valid Parentheses.
Memory Usage: 42 MB, less than 61.60% of Java online submissions for Valid Parentheses. */

import java.util.Stack;
class Solution {
    
    public static boolean isOpening(char c) {
        return c=='(' || c=='{' || c=='[';
    }
    
    public static boolean isMatching(char a,char b) {
        return (a=='(' && b==')') ||
               (a=='{' && b=='}') ||
               (a=='[' && b==']');
    }
  
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(isOpening(ch)){
                stk.push(ch);
            }
            else {
                if(stk.isEmpty()) {
                    return false;
                }
                else if(!isMatching(stk.peek(), ch)) {
                    return false;
                }
                else {
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();
    }
}
