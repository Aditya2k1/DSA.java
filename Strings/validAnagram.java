/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

EXAMPLE 1:

Input: s = "anagram", t = "nagaram"
Output: true
 
EXAMPLE 2:

Input: s = "rat", t = "car"
Output: false
*/

/* Leetcode Runtime: 3 ms, faster than 95.05% of Java online submissions for Valid Anagram.
Memory Usage: 42.1 MB, less than 99.11% of Java online submissions for Valid Anagram. */

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
      
        if(s.length()!=t.length()){
            return false;
        }
        char s1[] = s.toCharArray();
        Arrays.sort(s1);
        
        char t1[] = t.toCharArray();
        Arrays.sort(t1);
        
        return Arrays.equals(s1,t1);
    }
}
