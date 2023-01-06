/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean res = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return res;
    }
    public int helper(TreeNode root)
    {
        if(root==null)return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        if(Math.abs(l-r)>1)
            res = false;
        return 1+Math.max(l,r);
    }
}