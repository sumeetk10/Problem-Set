package Week1;
//      https://leetcode.com/problems/climbing-stairs/description/

public class ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(1,1);
            map.put(2,2);
            return climbStairs(n, map);
        }
        int climbStairs(int n, HashMap<Integer,Integer> map){
            if(map.containsKey(n)){
                return map.get(n);
            }
            map.put(n,climbStairs(n-1,map) + climbStairs(n-2,map));
            return map.get(n);
        }
    }
}

// TC = 0(n)
// SC = 0(n)

// Bottom up optimised

class solution{
    public int climbStairs(int n) {
        if(n == 0 || n == 1) return n;

        int prev1 = 2;
        int prev2 = 1;
        int i = 0;
        while(i>2 && i<=n){
            int newValue = prev1 + prev2;
            prev2 = prev1;
            prev1 = newValue;
        }
        return prev1;
    }
}