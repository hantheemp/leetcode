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
    public int maxDepth(TreeNode root) {
		if (root == null)
		{
			return 0;
		}
		
		int left = 0,
			right = 0;
		
		if (root.left != null)
		{
			left = 1 + this.maxDepth(root.left);
		}
		
		else
		{
			left += 1;
		}
		
		if (root.right != null)
		{
			right = 1 + this.maxDepth(root.right);
		}
		
		else
		{
			right += 1;
		}
		
		return Math.max(left, right);
		
	}
}