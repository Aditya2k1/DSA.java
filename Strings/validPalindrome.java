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

------------------------------------------------------------------------------or---------------------------------------------------------------------------------------

//Runtime - 0ms
//Source  - https://programs.programmingoneonone.com/2021/08/leetcode-valid-palindrome-problem-solution.html

int i =0, j = s.length()-1;
    while(i<j) {
        while(i<s.length() && !isAlphaNumeric(s.charAt(i))) i++;
        while(j>=0 && !isAlphaNumeric(s.charAt(j))) j--;
        if (j>i && !compare(s.charAt(i), s.charAt(j))) {
            return false;
        }
        i++;j--;
    }
        
   return true;           
}
private boolean compare(char a, char b) {
    if (Character.isUpperCase(a)) {
        a = (char)(a + 32);
    }
    if (Character.isUpperCase(b)) {
        b = (char)(b +32);
    }
    return a == b;
}

private boolean isAlphaNumeric(char c) {
    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' ||
        c>= '0' && c <='9') {
        return true;
    }
    return false;
}
