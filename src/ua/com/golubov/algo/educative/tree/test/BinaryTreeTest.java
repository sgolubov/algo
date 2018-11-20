package ua.com.golubov.algo.educative.tree.test;

import org.junit.Before;
import org.junit.Test;
import ua.com.golubov.algo.educative.tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    private BinaryTree<Integer> binaryTree;

    @Before
    public void setUp() {
        binaryTree = new BinaryTree<>(50);
        binaryTree.insert(20);
        binaryTree.insert(30);
        binaryTree.insert(10);
        binaryTree.insert(80);
        binaryTree.insert(70);
        binaryTree.insert(60);
        binaryTree.insert(90);
    }

    @Test
    public void shouldFindElement() {
        assertTrue(binaryTree.find(30));
        assertTrue(binaryTree.find(80));
        assertFalse(binaryTree.find(15));
    }

    @Test
    public void shouldRemoveElements() {
        binaryTree.traversePreOrder();
        binaryTree.traverseInOrder();
        binaryTree.traversePostOrder();
        assertTrue(binaryTree.find(30));
        binaryTree.remove(30);
        assertFalse(binaryTree.find(30));
        assertTrue(binaryTree.find(60));
        binaryTree.remove(60);
        assertFalse(binaryTree.find(60));
    }

    @Test
    public void shouldPrintElementsDepthFirst() {
        binaryTree.traversePreOrder();
        binaryTree.traverseInOrder();
        binaryTree.traversePostOrder();
    }

    @Test
    public void shouldPrintElementsBreathFirst() {
        binaryTree.printBreathFirst();
    }

    @Test
    public void shouldIterateInOrder() {

        List<String> result = new LinkedList<>();

        for (BinaryTree.Node<Integer> node : binaryTree) {
            result.add(node.getVal() + "");
        }

        assertEquals("10,20,30,50,60,70,80,90", String.join(",", result));
    }

    @Test
    public void shouldConvertToListInPostOrder() {

        List<String> result = new LinkedList<>();

        for (Integer val : binaryTree.convertToListInPostOrder()) {
            result.add(val + "");
        }

        assertEquals("10,30,20,60,70,90,80,50", String.join(",", result));
    }

}