package Leetcode_Daily.January;

import java.util.Arrays;

public class Jan1 {
    class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int maxCookie = s.length;
        if(s.length == 0) return 0;

        Arrays.sort(s);
        Arrays.sort(g);

        int maxNum = 0;
        int cookieIndex = maxCookie -1;
        int greedyIndex = g.length -1;

        while(cookieIndex >=0 && greedyIndex >=0) {
            if(s[cookieIndex] >= g[greedyIndex]){
                maxNum++;
                cookieIndex--;
                greedyIndex--;
            }
            else{
                greedyIndex--;
            }
        }

        maxCookie = maxNum;
        return maxCookie;
        
    }
}
}
