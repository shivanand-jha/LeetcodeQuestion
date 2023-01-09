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
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> a = new ArrayList<Integer>();
        Stack<TreeNode> r = new Stack<TreeNode>();
        while(node!=null)
        {
            a.add(node.val);
            if(node.right!=null)
            {
                r.push(node.right);
            }
            if(node.left == null && !r.isEmpty())
            {
                node = r.pop();
            }
            else
            {
                node = node.left;
            }
        }
        return a;
    }
}