package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.ZigZagBinaryTreeTraversal;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ZigZagBinaryTreeTraversalTest {

    private ZigZagBinaryTreeTraversal underTest = new ZigZagBinaryTreeTraversal();

    @Test
    public void test1() {
        ZigZagBinaryTreeTraversal.TreeNode root = new ZigZagBinaryTreeTraversal.TreeNode(1,
                new ZigZagBinaryTreeTraversal.TreeNode(2, new ZigZagBinaryTreeTraversal.TreeNode(4, null, null), null),
                new ZigZagBinaryTreeTraversal.TreeNode(3, null, new ZigZagBinaryTreeTraversal.TreeNode(5, null, null)));

        List<List<Integer>> result = List.of(List.of(1), List.of(3, 2), List.of(4, 5));
        assertEquals(result, underTest.zigzagLevelOrder(root));
    }

    @Test
    public void test2() {
        // [0,2,4,1,null,3,-1,5,1,null,6,null,8]
        ZigZagBinaryTreeTraversal.TreeNode root = new ZigZagBinaryTreeTraversal.TreeNode(0,
                new ZigZagBinaryTreeTraversal.TreeNode(2, new ZigZagBinaryTreeTraversal.TreeNode(1, new ZigZagBinaryTreeTraversal.TreeNode(5, null, null), new ZigZagBinaryTreeTraversal.TreeNode(1, null, null)), null),
                new ZigZagBinaryTreeTraversal.TreeNode(4, new ZigZagBinaryTreeTraversal.TreeNode(3, new ZigZagBinaryTreeTraversal.TreeNode(6, null, null), null), new ZigZagBinaryTreeTraversal.TreeNode(-1, new ZigZagBinaryTreeTraversal.TreeNode(8, null, null), null)));

        // [[0],[4,2],[1,3,-1],[8,6,1,5]]
        List<List<Integer>> result = List.of(List.of(0), List.of(4, 2), List.of(1, 3, -1), List.of(8, 6, 1, 5));
        assertEquals(result, underTest.zigzagLevelOrder(root));
    }

}
