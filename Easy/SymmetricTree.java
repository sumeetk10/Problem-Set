import javax.swing.tree.TreeNode;

//       https://leetcode.com/problems/symmetric-tree/description/

public class SymmetricTree {
    class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null) return true;

        return checkMirror(root.left, root.right);
    }

    public boolean checkMirror(TreeNode left, TreeNode right) {

        if(left == null && right == null) return true;

        if(left == null || right == null) return false;

        return (left.val == right.val) && 
        checkMirror(left.left,right.right) && 
        checkMirror(left.right,right.left);
    }
}
}

// Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(n) depth of recursion tree can go upto n in case of skewed tree and in average case it will be O(logn)

