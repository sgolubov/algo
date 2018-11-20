package ua.com.golubov.algo.educative.tree;

import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

public class BinaryTree<T extends Comparable<T>> implements Iterator<BinaryTree.Node<T>>, Iterable<BinaryTree.Node<T>> {

    private Node<T> root;
    private Deque<Node<T>> nodeStack = new LinkedList<>();
    private boolean validIterable;

    public BinaryTree(T rootValue) {
        if (rootValue == null) {
            throw new IllegalArgumentException();
        }
        this.root = new Node<>(rootValue);
    }

    public void insert(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        root = insert(value, root);
        validIterable = false;
    }

    public boolean find(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return find(value, root);
    }

    public void remove(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        root = remove(value, root);
        validIterable = false;
    }

    public void traversePreOrder() {
        traversePreOrder(root, node -> System.out.print(node.val + " | "));
        System.out.println();
    }

    private void traversePreOrder(Node<T> node, Consumer<Node<T>> nodeConsumer) {
        if (node == null)
            return;

        nodeConsumer.accept(node);
        traversePreOrder(node.left, nodeConsumer);
        traversePreOrder(node.right, nodeConsumer);
    }

    public void traverseInOrder() {
        traverseInOrder(root, node -> System.out.print(node.val + " | "));
        System.out.println();
    }

    private void traverseInOrder(Node<T> node, Consumer<Node<T>> nodeConsumer) {
        if (node == null)
            return;

        traverseInOrder(node.left, nodeConsumer);
        nodeConsumer.accept(node);
        traverseInOrder(node.right, nodeConsumer);
    }

    public void traversePostOrder() {
        traversePostOrder(root, node -> System.out.print(node.val + " | "));
        System.out.println();
    }

    private void traversePostOrder(Node<T> node, Consumer<Node<T>> nodeConsumer) {
        if (node == null)
            return;

        traversePostOrder(node.left, nodeConsumer);
        traversePostOrder(node.right, nodeConsumer);
        nodeConsumer.accept(node);
    }

    private Node<T> insert(T value, Node<T> node) {
        if (node == null) {
            return new Node<>(value);
        }

        if (node.val.compareTo(value) < 0) {
            node.right = insert(value, node.right);
            return node;
        } else if (node.val.compareTo(value) > 0) {
            node.left = insert(value, node.left);
            return node;
        }

        return node;
    }

    private boolean find(T value, Node<T> node) {
        if (node == null) {
            return false;
        }

        if (node.val.equals(value)) {
            return true;
        }

        if (node.val.compareTo(value) < 0) {
            return find(value, node.right);
        }

        return find(value, node.left);
    }

    private Node<T> remove(T value, Node<T> node) {
        if (node == null) {
            return null;
        }

        if (node.val == value) {
            return removeNode(node);
        }

        if (node.val.compareTo(value) < 0) {
            node.right = remove(value, node.right);
            return node;
        } else {
            node.left = remove(value, node.left);
            return node;
        }
    }

    private Node<T> removeNode(Node<T> node) {
        if (node.left == null && node.right == null) {
            return null;
        }
        if (node.left != null && node.right != null) {
            T smallest = traverseLeft(node.right, n -> { /* empty */ });
            remove(smallest, node);
            node.val = smallest;
            return node;
        }
        if (node.left != null) {
            return node.left;
        }
        return node.right;
    }

    private T traverseLeft(Node<T> node, Consumer<Node<T>> nodeConsumer) {
        nodeConsumer.accept(node);
        return node.left == null ? node.val : traverseLeft(node.left, nodeConsumer);
    }

    public void printBreathFirst() {
        Queue<Node<T>> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            Node<T> node = nodeQueue.poll();
            System.out.print(node.val + " | ");
            if (node.left != null)
                nodeQueue.add(node.left);
            if (node.right != null)
                nodeQueue.add(node.right);
        }
    }

    public List<T> convertToListInPostOrder() {
        List<T> result = new LinkedList<>();
        traversePostOrder(root, n -> result.add(n.getVal()));
        return result;
    }

    @Override
    public boolean hasNext() {
        if (!validIterable) {
            throw new ConcurrentModificationException();
        }
        return !nodeStack.isEmpty();
    }

    @Override
    public Node<T> next() {
        if (!validIterable) {
            throw new ConcurrentModificationException();
        }
        Node<T> node = nodeStack.pop();
        if (node.right != null) {
            traverseLeft(node.right, n -> nodeStack.push(n));
        }
        return node;
    }

    @Override
    public Iterator<Node<T>> iterator() {
        nodeStack.clear();
        traverseLeft(root, n -> nodeStack.push(n));
        validIterable = true;
        return this;
    }

    public static class Node<T extends Comparable<T>> {
        T val;
        Node<T> left;
        Node<T> right;

        private Node(T value) {
            this.val = value;
        }

        public T getVal() {
            return this.val;
        }

    }

}
