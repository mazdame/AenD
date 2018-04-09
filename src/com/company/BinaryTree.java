package com.company;




// BINARY SEARCH TREE
// BINARY SEARCH TREE
// BINARY SEARCH TREE

class BinaryTreee {
    private TreeNode root;

    public BinaryTreee() {
    }

    public BinaryTreee(int[] a) {
        this();
        for (int i : a) {
            add(i);
        }
    }

    private static class TreeNode {
        TreeNode left;
        int item;
        TreeNode right;

        TreeNode(TreeNode left, int item, TreeNode right) {
            this.left = left;
            this.right = right;
            this.item = item;
        }
    }

    public void add(int item) {
        if (root == null) {
            root = new TreeNode(null, item, null);
            return;
        }

        TreeNode node = root;
        while (true) {
            if (item < node.item) {
                if (node.left == null) {
                    node.left = new TreeNode(null, item, null);
                    break;
                }
                node = node.left;
            } else if (item > node.item) {
                if (node.right == null) {
                    node.right = new TreeNode(null, item, null);
                    break;
                }
                node = node.right;
            } else {
                break;
            }
        }
    }
    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(TreeNode node) {
        if (node == null) {
            return null;
        }
        return "[" + toString(node.left) + "," + node.item + "," + toString(node.right) + "]";
    }
}

