package com.dsa.tree.problems;

import com.dsa.tree.node.TreeNode;

public class Height<V> {
    public int treeHeight(TreeNode<V> root){
        if(root == null){ return -1;}
        int l = treeHeight(root.left);
        int r = treeHeight(root.right);
        return Math.max(l, r) + 1;
    }
}
