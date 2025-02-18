package com.dsa.tree.problems;

import com.dsa.tree.node.TreeNode;

public class BalancedTree<V> {
    /*
    1. if a tree is balanced if it have same number of nodes on either side of root.
     */
    public boolean isBalanced(TreeNode<V> root){
        return isBalanced(root, 0,0);
    }
    public boolean isBalanced(TreeNode<V> root, int left_Count,int right_Count){
        if(root == null){
            return false;
        }
       // int left_Value = (root.left!=null) ? left_Count+1:left_Count;
        //int right_value = (root.right!= null) ? right_Count+1:right_Count;
        int left_Height = new Height<V>().treeHeight(root.left);
        int right_Height = new Height<V>().treeHeight(root.right);
        return Math.abs(left_Height-right_Height) <= 1 ;
    }
}
