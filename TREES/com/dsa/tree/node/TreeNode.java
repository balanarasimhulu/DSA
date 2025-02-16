package com.dsa.tree.node;

public class TreeNode<V> {
    public V data;
    public TreeNode<V> left;
    public TreeNode<V> right;

    public TreeNode(V data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
