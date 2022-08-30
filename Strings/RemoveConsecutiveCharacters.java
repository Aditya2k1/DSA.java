/*
Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.
*/


class Solution{
    public String removeConsecutiveCharacter(String S){
        if(S.length()==0){
            return S;
        }
        
        StringBuffer str = new StringBuffer();
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)==S.charAt(i+1)){
                continue;
            }
            else{
                str.append(S.charAt(i));
            }
        }
        str.append(S.charAt(S.length()-1));
        return str.toString();
    }
}
