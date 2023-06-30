public class RemoveDuplicate {
    class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;

        int newIndex = 1;

        for(int i=0; i<len-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[newIndex] = nums[i+1];
                newIndex++;
            }
        }

        return newIndex;
    }
}
}
