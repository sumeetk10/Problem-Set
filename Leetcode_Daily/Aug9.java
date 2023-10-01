package Leetcode_Daily;

import java.util.Arrays;

public class Aug9 {
    class Solution {
    public int minimizeMax(int[] nums, int p) {
       Arrays.sort(nums);

       int left = 0;
       int n = nums.length-1;
       int right = nums[n] - nums[0];

       while(left < right) {
           int mid = left + (right-left)/2;

           if(check(nums,mid) >=p) {
               right = mid;
           }
           else{
               left = mid+1;
           }
       }
       return left;
    }

    public int check(int[] nums, int threshold) {
        int index= 0;
        int count = 0;
        while(index < nums.length-1) {
            if(nums[index+1] - nums[index] <= threshold) {
                index++;
                count++;

            }
            index++;
        }

        return count;
    }

}
}
