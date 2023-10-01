package Leetcode_Daily;

import java.util.ArrayList;
import java.util.List;

public class Aug1 {
    class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        helper(n,k,1,temp,result);
        return result;
    }
    public void helper(int n,int k, int index,List<Integer> temp, List<List<Integer>> result)
    {
        if(k == 0)
        {
            List<Integer> res = new ArrayList(temp);
            result.add(res);
            return;
        }
        if(index>n)
            return;
        temp.add(index);
        helper(n,k-1,index+1,temp,result);
        temp.remove(temp.size()-1);
        helper(n,k,index+1,temp,result);
    }
}
}


// https://leetcode.com/problems/combinations/