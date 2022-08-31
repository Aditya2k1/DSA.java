/*
Input : GEEKSFORGEEKS
Output : 4333355777733366677743333557777
For obtaining a number, we need to press a
number corresponding to that character for 
number of times equal to position of the 
character. For example, for character C, 
we press number 2 three times and accordingly.

Input : HELLO WORLD
Output : 4433555555666096667775553
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mobileNumericKeypadSequence {
    
    public static String printSequence(String s){
        String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999",};

        String output="";
        s = s.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                output += "0";
            }
            else{
                output += str[(s.charAt(i)-'A')];
            }
        }
        return output;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string: ");
        String s = br.readLine();

        System.out.println(printSequence(s));
    }
}
