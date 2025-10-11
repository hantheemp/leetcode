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
    public static int sumOfLeftLeaves(TreeNode root) {

		return recursive(root, false);

	}

	public static int recursive(TreeNode node, boolean isLeft) {
		if (node == null)
			return 0;

		if (node.left == null && node.right == null) {
			return isLeft ? node.val : 0;
		}

		return recursive(node.left, true) + recursive(node.right, false);

	}

}