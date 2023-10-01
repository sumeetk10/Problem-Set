package Medium.Week1;

import javax.swing.tree.TreeNode;

public class TreePrune{
    class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        TreeNode output = new TreeNode(root.val);

        output.left = pruneTree(root.left);
        output.right = pruneTree(root.right);

        if(output.val == 0 && output.left == null && output.right == null) return null;

        return output;
    }
}
}
