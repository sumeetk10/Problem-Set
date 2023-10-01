package Medium.Week1;

public class LongestPalindromeSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            String temp = "";
    
            for(int i=0; i<s.length(); i++) {
                String odd = find(s,i,i+1);
                String even = find(s,i,i);
    
                if(odd.length() > temp.length()){
                    temp = odd;
                }
                if(even.length() > temp.length()) {
                    temp = even;
                }
            }
    
            return temp;
        }
    
        public String find(String s, int l, int r) {
            while(l>= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            return s.substring(l+1,r);
        }
    }
            
    
}
