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
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root == null){
    //         return 0;
    //     }
    //     // if(root.left == null){
    //     //     return heightoftree(root.right);
    //     // }
    //     //  if(root.right == null){
    //     //     return heightoftree(root.left);
    //     // }

    //     int diameter =  heightoftree(root.left) + heightoftree(root.right);
    //     int sub = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
    //     return Math.max(diameter, sub);
        
    // }

     public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }

    public int heightoftree(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(heightoftree(root.left), heightoftree(root.right));
    }
}

