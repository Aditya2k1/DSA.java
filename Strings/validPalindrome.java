import java.util.Scanner;

public class str_1_validPalindrome{
    
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
