// https://leetcode.com/problems/keys-and-rooms/description/

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class RoomAndKey {
    class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Stack<Integer> st = new Stack<>();
        Set<Integer> set = new HashSet<>();

        st.push(0);

        while(!st.isEmpty()) {
            int curr = st.pop();

            if(!set.contains(curr)){
                set.add(curr);

                for(int x: rooms.get(curr)){
                    if(!set.contains(x)){
                        st.add(x);
                    }
                }
            }
        }

        return set.size() == rooms.size();
    }
}
}
