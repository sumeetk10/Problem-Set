package Leetcode_Daily.January;

import java.util.ArrayList;
import java.util.List;

public class Jan2 {
    class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        int[] frequency = new int[nums.length+1];

        for(int n : nums) {
            if(frequency[n] >= ans.size()){
                ans.add(new ArrayList<>());
            }

            ans.get(frequency[n]).add(n);
            frequency[n]++;
        }

        return ans;
    }
}
}
