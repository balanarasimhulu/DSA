package com.dsa.tree.problems;

import com.dsa.tree.node.TreeNode;

public class Client {
    public static void main(String[] args){


        TreeNode<Integer> node = generateTree();

        System.out.println("Max Depth :: " + new MaxMinDepth<Integer>().maxDepth(node));
        System.out.println("Is a Balanced Tree :: " + new BalancedTree<Integer>().isBalanced(node));
        System.out.println("Height of Tree :: " + new Height<Integer>().treeHeight(node));
    }

    public static TreeNode<Integer> generateTree() {
        TreeNode<Integer> node = new TreeNode<>(1);
        node.left = new TreeNode<>(2);
        node.right = new TreeNode<>(3);
        node.left.left = new TreeNode<>(4);
        node.left.right = new TreeNode<>(5);
       // node.left.left.left = new TreeNode<>(6);
        return node;
    }
}
