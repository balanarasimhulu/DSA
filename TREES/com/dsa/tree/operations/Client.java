package com.dsa.tree.operations;

import com.dsa.tree.node.TreeNode;

public class Client {

    public static void main(String[] args){

        TreeNode<Integer> node =    com.dsa.tree.problems.Client.generateTree();
        Operations<Integer> op = new Operations<>();
        op.inOrder(node);

    }
}
