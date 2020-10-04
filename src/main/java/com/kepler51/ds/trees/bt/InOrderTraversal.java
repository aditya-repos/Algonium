package com.kepler51.ds.trees.bt;

import com.kepler51.ds.trees.TNode;

import java.util.Stack;

public class InOrderTraversal {

    private void traverse(TNode root) {
        if (root == null)
            return;
        Stack<TNode> nodes = new Stack<>();
        nodes.add(root);

        while (true) {
            while (!nodes.isEmpty()) {
                if (root != null) {
                    nodes.add(root.getLeft());
                    root = root.getLeft();
                }
            }

            root = nodes.pop();
            System.out.println(root.getElement());


            /**
             * How to proceed further.
             * Till this point I stored all left child of root node.
             * Now my next step is to iterate over root and right child
             */
            System.out.println(root.getElement());
            nodes.pop();
            if (root.getRight() != null) {
                nodes.add(root.getRight());
                root = root.getRight();

            }
        }
    }
}
