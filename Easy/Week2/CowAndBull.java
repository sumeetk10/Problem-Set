//      https://leetcode.com/problems/bulls-and-cows/

public class CowAndBull {
    class Solution {
        public String getHint(String secret, String guess) {
            int cow = 0, bull = 0;
    
            int[] secretFreq = new int[10];
            int[] guessFreq = new int[10];
    
            for(int i=0; i<secret.length(); i++) {
                char s = secret.charAt(i);
                char g = guess.charAt(i);
    
                if(s == g) bull++;
                else {
                    secretFreq[s-'0']++;
                    guessFreq[g-'0']++;
                }
            }
    
            for(int i=0; i<10; i++) {
                cow += Integer.min(secretFreq[i],guessFreq[i]);
            }
    
            return bull+"A"+cow+"B";
        }
    }
}
