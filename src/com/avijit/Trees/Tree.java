package com.avijit.Trees;

public class Tree {
    private int val;
    private Tree left;
    private Tree right;

    public Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void insertLeft(Tree newNode){
        if (this.left == null){
            this.left = newNode;
        } else {
            newNode.left = this.left;
            this.left = newNode;
        }
    }

    public void insertRight(Tree newNode){
        if (this.right == null){
            this.right = newNode;
        }else {
            newNode.right = this.right;
            this.right = newNode;
        }
    }

    public Tree getLeftChild() {
        return this.left;
    }

    public Tree getRightChild() {
        return this.right;
    }

    public int getNodeValue() {
        return this.val;
    }

    public void setNodeValue(int value) {
        this.val = value;
    }
}
