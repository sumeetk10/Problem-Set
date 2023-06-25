package Week1;
//       https://leetcode.com/problems/two-sum/


import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(hashmap.containsKey(complement)){
                return new int[]{hashmap.get(complement),i};
            }
            hashmap.put(nums[i],i);
        }

        return null;
    }
}

// TC - 0(n) = for single traversal
// SC - 0(n) = space for hashmap
