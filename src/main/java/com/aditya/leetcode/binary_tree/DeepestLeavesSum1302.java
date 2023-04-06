package com.aditya.leetcode.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
    }
}


public class DeepestLeavesSum1302 {
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            int ans = 0;
            q.add(root);
            while(!q.isEmpty()){
                ans = 0;
                int q_size = q.size();
                for(int i=0; i<q_size; ++i){
                    TreeNode node = q.element();
                    if(node.left != null)
                        q.add(node.left);
                    if(node.right != null)
                        q.add(node.right);
                    ans += node.val;
                    q.poll();
                }
            }
            return ans;
        }
}
