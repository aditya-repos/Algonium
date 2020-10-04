package com.kepler51.ds.trees;

public class TNode {
    private int element;
    private TNode left;
    private TNode right;

    public TNode(int element){
        this.setElement(element);
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public TNode getLeft() {
        return this.left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return this.right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }
}
