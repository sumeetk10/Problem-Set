package Week1;
//      https://leetcode.com/problems/maximum-subarray/

//      Also known as maximum sum subarray -> keeping the current sum until it goes negative
public class Kadane_Algo {
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
    
            for(int i=0; i<nums.length; i++){
                currentSum += nums[i];
    
                maxSum = Math.max(currentSum, maxSum);
    
                if(currentSum < 0) {
                    currentSum = 0;
                }
            }
    
            return maxSum;
        }
    }
}

// TC = 0(n) = single traversal
// SC = 0(1) = no extra space
