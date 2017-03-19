package com.leetcode.charpter101;

/**
 * Created by yy on 2017/3/17.
 */



public class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        } else {
            return isSame(root.left, root.right);
        }
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }  if (left != null && right == null || left == null && right != null){
            return false;
        } else {
            return left.val == right.val && isSame(left.left, right.right) && isSame(left.right, right.left);
        }
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
