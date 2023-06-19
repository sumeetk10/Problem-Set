//      https://leetcode.com/problems/count-and-say/description/

public class CountAndSay {
     public class Solution {
    public String countAndSay(int n) {
        
        String ans = "1";
        for(int i=1; i<n; i++) {
            ans = findIndex(ans);
        }
        return ans;
    }

    public String findIndex(String s){
        StringBuilder sb = new StringBuilder("");

        char ch = s.charAt(0);
        int count = 1;

        for(int i=1; i<s.length(); i++ ) {
            if(ch == s.charAt(i)){
                count++;
            }
            else {
                sb.append(count);
                sb.append(ch);
                count = 1;
                ch = s.charAt(i);
            }
        }
        sb.append(count);
        sb.append(ch);

        return sb.toString();
    }
}  
}
