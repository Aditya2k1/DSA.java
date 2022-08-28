/* Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

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
