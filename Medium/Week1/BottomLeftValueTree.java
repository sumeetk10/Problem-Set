package Medium.Week1;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BottomLeftValueTree {
    class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            root = queue.poll();

            if(root.right != null) queue.add(root.right);
            if(root.left != null) queue.add(root.left);
        }

        return root.val;
    }
}
}
