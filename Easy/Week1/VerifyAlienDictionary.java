package Week1;
//      https://leetcode.com/problems/verifying-an-alien-dictionary/description/

public class VerifyAlienDictionary {
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0; i<order.length(); i++) {
                map.put(order.charAt(i),i);
            }
    
            for(int i=1; i<words.length; i++) {
                if(!compare(words[i],words[i-1],map)){
                    return false;
                }
            }
            return true;
        }
    
        public boolean compare(String s1, String s2, HashMap<Character,Integer> map) {
            int l1 = s1.length();
            int l2 = s2.length();
    
            for(int i=0,j=0; i<l1 && j<l2; i++,j++) {
                if(s1.charAt(i) != s2.charAt(i)){
    
                    if(map.get(s1.charAt(i)) < map.get(s2.charAt(j))){
                        return false;
                    }
                    else 
                        return true;
                }
            }
    
            if(l1 < l2) return false;
            return true;
        }
    }
}


// TC = 0(n)
// SC = 0(n)