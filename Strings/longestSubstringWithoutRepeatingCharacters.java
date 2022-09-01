/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> check = new HashSet<>();
        int left=0, right=0, max=0;
        while(right<s.length()){
            char ch = s.charAt(right); 
            if(check.add(ch)){
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                while(s.charAt(left)!=ch){
                    check.remove(s.charAt(left));
                    left++;
                }
                check.remove(ch);
                left++;
            }
        }
        return max;
    }
}
