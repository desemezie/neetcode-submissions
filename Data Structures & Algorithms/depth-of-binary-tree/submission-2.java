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
    // if (root == null){ 
    //     return null;
    // }

    // int level = 0;
    // Deque<TreeNode> stack = new LinkedList<>();
    // stack.offer(root);
    // while(!stack.isEmpty()){
    //     TreeNode curr = stack.poll();

    //     if(curr.left != null){
    //         stack.offer(curr.left);
    //         level = 
    //     }
    //     if(curr.right != null){
    //         stack.offer(curr.right);
    //     }

    // }
    // return level; 
  
        Stack<Object[]> stack = new Stack<>();
        stack.push(new Object[]{root, 1});
        int res = 0;

        while (!stack.isEmpty()) {
            Object[] current = stack.pop();

            TreeNode node = (TreeNode) current[0];
            int depth = (int) current[1];

            if (node != null) {
                res = Math.max(res, depth);

                stack.push(new Object[]{node.left, depth + 1});
                stack.push(new Object[]{node.right, depth + 1});
            }
        }

        return res;
  
        
    }
}
