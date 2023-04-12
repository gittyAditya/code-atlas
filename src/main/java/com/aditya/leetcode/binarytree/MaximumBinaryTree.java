package com.aditya.leetcode.binarytree;

public class MaximumBinaryTree {

        public TreeNode buildSubtree(int start, int end, int[] nums){

            // Base Case if we remove condition (1) and (2)
//            if(end < start)
//                return null;
            int max = -1;
            int maxIndex = -1;
            for(int i=start; i<=end; ++i){
                if(nums[i] > max){
                    max = nums[i];
                    maxIndex = i;
                }
            }
            TreeNode root = new TreeNode().setVal(max);
            if(start != maxIndex)       // condition (1)
                root.setLeft(buildSubtree(start, maxIndex-1, nums));
            if(end != maxIndex)         // condition (2)
                root.setRight(buildSubtree(maxIndex+1, end, nums));
            return root;
        }

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            int size = nums.length;
            TreeNode root = buildSubtree(0, size-1, nums);
            return root;
        }
}
