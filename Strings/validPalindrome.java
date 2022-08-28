/* 
EXAMPLE 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

EXAMPLE 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

EXAMPLE 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

//LeetCode Runtime - 0ms - Accepted

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuffer a=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                a.append(s.charAt(i));
            }
        }
        int n=a.length()-1;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
}

----------------------------------------------------------------------or-------------------------------------------------------------------------------

//--------------------Runtime - 3ms--------------------

import java.util.Scanner;

public class validPalindrome{
    
    public static boolean validPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reverse = new StringBuffer(s).reverse().toString();
        
        return s.equals(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        System.out.println(validPalindrome(s));
    }
}
