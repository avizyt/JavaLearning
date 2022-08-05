package com.avijit.Trees;

public class Tree {
    private int val;
    private Tree left;
    private Tree right;

    // Constructor for Tree
    public Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    // Insert item to the left of the tree
    public void insertLeft(Tree newNode){
        if (this.left == null){
            this.left = newNode;
        } else {
            newNode.left = this.left;
            this.left = newNode;
        }
    }

    // insert item to the right of the tree
    public void insertRight(Tree newNode){
        if (this.right == null){
            this.right = newNode;
        }else {
            newNode.right = this.right;
            this.right = newNode;
        }
    }

    // Get the value of the left child
    public Tree getLeftChild() {
        return this.left;
    }

    // Get the value of the right child
    public Tree getRightChild() {
        return this.right;
    }

    // Get the value of the node
    public int getNodeValue() {
        return this.val;
    }

    // Set the value of the node
    public void setNodeValue(int value) {
        this.val = value;
    }
}
