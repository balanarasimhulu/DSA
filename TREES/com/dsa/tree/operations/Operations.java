package com.dsa.tree.operations;

import com.dsa.tree.node.TreeNode;

public class Operations<V> {
    // Inorder

    public void inOrder(TreeNode<V> root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }

}
