package com.dsa.tree.problems;

import com.dsa.tree.node.TreeNode;

public class MaxMinDepth<V> {
    //DFS depth first search
    // time complexity  : O(N)
    // space complexity O(H)
    public int maxDepth(TreeNode<V> root){
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r) + 1;
    }

    public int minDepth(TreeNode<V> root){
        if(root == null){ return 0; }

        int l = minDepth(root.left);
        int r = minDepth(root.right);
        return Math.min(l,r) + 1;
    }


}
