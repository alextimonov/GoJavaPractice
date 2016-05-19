package ua.goit.timonov.practice.practice_5.bstSearch;

/**
 * Class to find value in binary search tree
 */
public class BSTSearch {
    /* root node */
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    /**
     * returns true if given value is included to the binary tree
     * @param root          root of the binary tree
     * @param target        value to search
     * @return              true if value is included
     */
    public boolean exist(TreeNode root, int target) {
        TreeNode current = root;
        while (current != null) {
            if (target == current.getValue()) return true;
            if (target > current.getValue()) current = current.getRight();
            else current = current.getLeft();
        }
        return false;
    }

    /**
     * generates binary tree on given array
     * @param array         array of int numbers
     */
    public void buildTree(int[] array) {
        root = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            TreeNode currentNode = root;
            boolean positionFound = false;
            while (!positionFound) {
                if (array[i] > currentNode.getValue()) {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(new TreeNode(array[i]));
                        positionFound = true;
                    }
                    else {
                        currentNode = currentNode.getRight();
                    }
                }
                else {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(new TreeNode(array[i]));
                        positionFound = true;
                    }
                    else {
                        currentNode = currentNode.getLeft();
                    }

                }
            }
        }
    }
}

