import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class RootToLeaf {
    class Solution {
    public List binaryTreePaths(TreeNode root) {

        List list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
            if(root==null)
            return null;

            int len = sb.length();
            sb.append(root.val);
        
        
        if(root.left==null && root.right==null){
            list.add(sb.toString());
        }else{
            sb.append("->");
            binaryTreePaths(root.left);
            binaryTreePaths(root.right);
        }
        
        sb.setLength(len);
        
        return list;
    }
}
}
