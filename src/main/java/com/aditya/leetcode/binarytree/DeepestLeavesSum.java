package com.aditya.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            int ans = 0;
            q.add(root);
            while(!q.isEmpty()){
                ans = 0;
                int q_size = q.size();
                for(int i=0; i<q_size; ++i){
                    TreeNode node = q.element();
                    if(node.getLeft() != null)
                        q.add(node.getLeft());
                    if(node.getRight() != null)
                        q.add(node.getRight());
                    ans += node.getVal();
                    q.poll();
                }
            }
            return ans;
        }
}
