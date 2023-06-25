package Week1;
//      https://leetcode.com/problems/string-compression/description/

public class StringComparison {
    class Solution {
        public int compress(char[] chars) {
            int count = 1;
            int index = 0;
    
            if(chars.length == 0){
                return 0;
            }
    
            for(int i=0; i<chars.length; i++){
                count = 1;
                while(i<chars.length-1 && chars[i] == chars[i+1]){
                    count++;
                    i++;
                }
                chars[index] = chars[i];
                index++;
                if(count>1){
                    for(char c: Integer.toString(count).toCharArray()){
                        chars[index] = c;
                        index++;
                    }
                }
            }
    
            return index;
        }
    }
}

