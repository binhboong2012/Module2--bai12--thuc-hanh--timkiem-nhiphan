package com.codegym;

public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public void inorder() {
        TreeNode<E> root = null;
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
