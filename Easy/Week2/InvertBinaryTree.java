//      https://leetcode.com/problems/invert-binary-tree/description/

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null) return root;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;

        return root;
        
    }
}
}


// TC = 0(0)
// SC = 0(n)