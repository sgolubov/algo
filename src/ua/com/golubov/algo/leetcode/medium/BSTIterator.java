package ua.com.golubov.algo.leetcode.medium;

import ua.com.golubov.algo.educative.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

class BSTIterator {

    private Queue<TreeNode> queue = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        traverseInOrder(root, queue);
    }

    private void traverseInOrder(TreeNode node, Queue<TreeNode> treeNodeQueue) {
        if (node == null)
            return;

        traverseInOrder(node.left, treeNodeQueue);
        treeNodeQueue.offer(node);
        traverseInOrder(node.right, treeNodeQueue);
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return queue.remove().val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
