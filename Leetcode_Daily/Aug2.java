package Leetcode_Daily;

import java.util.ArrayList;
import java.util.List;

public class Aug2 {
    class Solution {
    public void helper(int[] nums,List<Integer> temp,boolean[] visited,List<List<Integer>> result)
    {
        if(temp.size() == nums.length)
        {
            result.add(new ArrayList(temp));
            return;
        }
        for(int i =0;i<nums.length;i++)
        {
            if(!visited[i])
            {
                temp.add(nums[i]);
                visited[i] = true;
                helper(nums,temp,visited,result);
                temp.remove((Integer)nums[i]);
                visited[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        helper(nums,temp,visited,result);
        return result;
    }
}
}

// Find all combination of nums