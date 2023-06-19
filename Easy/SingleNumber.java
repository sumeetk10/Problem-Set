//      https://leetcode.com/problems/single-number/

public class SingleNumber {
    class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1) {
            return nums[0];
        }

        if(nums.length %2 ==0) return -1;

        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            ans = ans^nums[i];
        }

        return ans;
    }
}
}
