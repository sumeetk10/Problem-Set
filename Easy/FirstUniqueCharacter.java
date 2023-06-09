//      https://leetcode.com/problems/first-unique-character-in-a-string/description/

public class FirstUniqueCharacter {
    class Solution {
        public int firstUniqChar(String s) {
            if(s == null || s.length() == 0){
                return -1;
            }
            Map<Character,Integer> charmap = new HashMap<>();
            Set<Character> unique = new LinkedHashSet<>();
            char[] c = s.toCharArray();
            for(int i = 0 ; i < c.length; i ++){
                if(charmap.containsKey(c[i])){
                    charmap.put(c[i], charmap.get(c[i]) + 1 );
                    unique.remove(c[i]);
                }else{
                    charmap.put(c[i], 1 );
                    unique.add(c[i]);
                }
                
            }
             if(unique.size() == 0){
                return -1;
            }
            return s.indexOf(unique.iterator().next());
        }
    }
    
}
