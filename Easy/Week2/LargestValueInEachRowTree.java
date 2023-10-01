import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LargestValueInEachRowTree {
    class Solution {
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        helper(root, list, 0);
        return list;
    }

    public void helper(TreeNode root, List<Integer>list, int level) {
        if(root == null) return;

        if(level == list.size()){
            list.add(root.val);
        }
        else{
            list.set(level,Math.max(list.get(level), root.val));
        }

        helper(root.left,list,level+1);
        helper(root.right,list,level+1);
    }
}
}
