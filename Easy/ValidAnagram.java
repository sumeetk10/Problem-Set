public class ValidAnagram {
    public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        char[] str_s = s.toCharArray();
        char[] str_t = t.toCharArray();
        int[] mask = new int[256];
        for(char c : str_s) {
            mask[c]++;
        }
        for(char c : str_t) {
            if(mask[c] > 0) {
                mask[c]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
}
