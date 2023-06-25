package Week1;
//      https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
    }
}

// TC = 0(n)
// SC = 0(1)