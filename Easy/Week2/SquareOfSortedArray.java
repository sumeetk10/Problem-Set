public class SquareOfSortedArray {
    class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result = new int[nums.length];

        int i=0, j=nums.length-1, k=nums.length-1;

        while(i<=j && k>=0) {
            if(nums[i] * nums[i] < nums[j]*nums[j]) {
                result[k] = nums[j]*nums[j];
                j--;
            }
            else{
                result[k] = nums[i]* nums[i];
                i++;
            }
            k--;
        }

        return result;
    }
}
}
