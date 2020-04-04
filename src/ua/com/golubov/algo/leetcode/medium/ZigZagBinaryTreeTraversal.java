package ua.com.golubov.algo.leetcode.medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagBinaryTreeTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> result = new LinkedList<>();
        result.add(List.of(root.val));
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root.left);
        deque.addFirst(root.right);

        processNextLevel(deque, result, 2);

        return result;
    }

    private void processNextLevel(Deque<TreeNode> deque, List<List<Integer>> result, int level) {
        if (deque.isEmpty()) {
            return;
        }
        List<Integer> levelResult = new LinkedList<>();
        Deque<TreeNode> nextLevel = new LinkedList<>();
        while (!deque.isEmpty()) {
            TreeNode node = deque.remove();
            if (node != null) {
                levelResult.add(node.val);
                if (level % 2 == 0) {
                    nextLevel.addFirst(node.right);
                    nextLevel.addFirst(node.left);
                } else {
                    nextLevel.addFirst(node.left);
                    nextLevel.addFirst(node.right);
                }
            }

        }
        if (!levelResult.isEmpty()) {
            result.add(levelResult);
        }
        processNextLevel(nextLevel, result, ++level);
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x, TreeNode left, TreeNode right) {
            val = x;
            this.left = left;
            this.right = right;
        }
    }

}
