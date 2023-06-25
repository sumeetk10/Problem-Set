public class RangeBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stk = new Stack<>();
        int sum = 0;
        stk.push(root);

        while(!stk.isEmpty()) {
            TreeNode n = stk.pop();
            if(n == null) continue;

            if(n.val > low) {
                stk.push(n.left);
            }
            if(n.val < high) {
                stk.push(n.right);
            }
            if(n.val >= low && n.val <= high) {
                sum += n.val;
            }
        }
        return sum;
    }
}


// Recursion

// class Solution {
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         if(root == null) return 0;

//         int sum = 0;

//         if(root.val >=low && root.val <= high) sum+= root.val;
//         if(root.val > low) sum+= rangeSumBST(root.left,low,high);
//         if(root.val < high) sum+= rangeSumBST(root.right,low,high);

//         return sum;
//     }
// }
