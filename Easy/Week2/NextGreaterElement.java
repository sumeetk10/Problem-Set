import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int num : nums2) {
            while(!st.isEmpty() && num>st.peek()) {
                map.put(st.pop(),num);
            }

            st.add(num);
        }

        int i=0;

        for(int ele : nums1) {
            ans[i++] = map.getOrDefault(ele,-1);
        }

        return ans;
    }
}
}
