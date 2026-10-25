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
    // public int maxDepth(TreeNode root) {

     
    //     if (root == null) {
    //         return 0;
    //     }

    //     Stack<TreeNode> stack = new Stack<>();
    //     stack.push(root);

    //     int depth = 0;

    //     while (!stack.isEmpty()) {
    //         int size = stack.size();
    //         depth++;

    //         for (int i = 0; i < size; i++) {
    //             TreeNode node = stack.pop();

    //             if (node.left != null) {
    //                 stack.push(node.left);
    //             }

    //             if (node.right != null) {
    //                 stack.push(node.right);
    //             }
    //         }
    //     }

    //     return depth;
  

        
    // }

    public int maxDepth(TreeNode root) {
        int[] res = new int[1];
        return dfs(root, res);
         
    
    }
    private int dfs(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        // res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
    

}
