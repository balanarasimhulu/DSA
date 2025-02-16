package com.dsa.tree.problems;

import com.dsa.tree.node.TreeNode;

public class Client {

    public static void main(String[] args){
        TreeNode<Integer> node = new TreeNode<>(1);
        node.left = new TreeNode<>(2);
        node.right = new TreeNode<>(3);
        node.left.left = new TreeNode<>(4);
        node.left.right = new TreeNode<>(5);
        Operations<Integer> op = new Operations<>();
        op.inOrder(node);

    }
}
