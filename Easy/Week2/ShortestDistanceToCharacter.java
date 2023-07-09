class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int len = s.length();
        int[] answer = new int[len];
        Arrays.fill(answer,len);

        for(int i=0; i<len; i++) {
            if(s.charAt(i) == c) {
                answer[i] = 0;
            }
            else if(i>0){
                answer[i] = Integer.min(answer[i],answer[i-1]+1);
            }
        }

        for(int i=len-1; i>=0; i--) {
            if(s.charAt(i) == c) {
                answer[i] = 0;
            }
            else if(i<len-1){
                answer[i] = Integer.min(answer[i],answer[i+1]+1);
            }
        }

        return answer;

    }
}