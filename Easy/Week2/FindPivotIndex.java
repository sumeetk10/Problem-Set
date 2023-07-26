public class FindPivotIndex {
    class Solution {
        public int pivotIndex(int[] nums) {
            
            if(nums.length == 0) return -1;
    
            int leftsum = 0;
            int rightsum = 0;
    
            for(int num : nums) {
                rightsum += num;
            }
    
            for(int i=0; i<nums.length; i++) {
                rightsum -= nums[i];
                if(rightsum == leftsum) return i;
                leftsum += nums[i];
            }
    
            return -1;
        }
    }
}
