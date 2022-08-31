/* Print all duplicates in a given string */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class countDuplicates{
    public static HashMap<Character, Integer> Count(String s){
        HashMap<Character, Integer> value = new HashMap<>();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(!value.containsKey(s.charAt(i))){
                value.put(s.charAt(i), 1);
            }
            else{
                value.put(s.charAt(i), value.get(s.charAt(i))+1);
            }
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string: ");
        String s = br.readLine();

        for(Map.Entry<Character, Integer> elements: Count(s).entrySet()){
            if(elements.getValue()>1){
                System.out.println(elements.getKey() + ", " + elements.getValue());
            }
        }
    }
}  
