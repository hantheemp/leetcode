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
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        inOrder(root, result);
        
        return result;
    }

    void inOrder(TreeNode node, ArrayList<Integer> res) {
        if (node == null)
            return;

        inOrder(node.left, res);
        res.add(node.val);
        inOrder(node.right, res);
    }

}