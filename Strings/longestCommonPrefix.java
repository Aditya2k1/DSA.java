/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

/* Leetcode Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
Memory Usage: 39.7 MB, less than 99.94% of Java online submissions for Longest Common Prefix. */
  
  
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){

            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
