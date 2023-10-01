public class MaxWater {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length-1;
            int water = 0;
    
            while(left < right) {
    
                int leftMax = height[left];
                int rightMax = height[right];
    
                water = Math.max(water, (right-left)*Math.min(leftMax,rightMax));
    
                if(leftMax < rightMax) left++;
                else right--;
            }
    
            return water;
        }
    }
}


// https://leetcode.com/problems/container-with-most-water/description/