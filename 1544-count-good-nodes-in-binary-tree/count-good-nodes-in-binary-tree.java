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
    public int goodNodes(TreeNode root) {
        /**
        Concepts:
            “For every node, I’ll:
            Decide if it’s good
            Then ask my left child
            Then ask my right child”
        We can't use the for loop iteration in the tree concepts DFS because 
        they are binary node so it will confuse => use recursion
         */
         return dfs(root, root.val);
    }

    public int dfs(TreeNode root, int maxScore){
        if(root == null){
            return 0;
        }
        int count = 0;
        //we are comparing the max so far and setting the count
        if(root.val >= maxScore){
            count = 1;
        }
        maxScore = Math.max(maxScore,root.val);
        //left babe
        count+= dfs(root.left,maxScore);
        //right babe
        count+= dfs(root.right,maxScore);
        return count;
    } 
}