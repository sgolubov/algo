package ua.com.golubov.algo.stepik;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HuffmanCodeService {

    private static Map<Character, String> charToCode;
//    private static HashMap<String, Character> codeToChar;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String encoded = encode(text);
        System.out.println(charToCode.size() + " " + encoded.length());
        charToCode.forEach((e, s) -> {
            System.out.println(e + ": " + s);
        });
        System.out.println(encoded);
        // put your code here
    }

    public static String encode(String text) {
        charToCode = new HashMap<>();
        Map<Character, Integer> charFreqMap = buildcharFrequencyMap(text.toCharArray());
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        charFreqMap.forEach((key, value) -> priorityQueue.add(new Node(key, value)));
        Node tree = buildEncodingTree(priorityQueue);
        if (tree.isLeaf) {
            charToCode.put(tree.value, "0");
            return IntStream.range(0, tree.weight).mapToObj(i -> "0").collect(Collectors.joining());
        }
        postorder(tree, "");
        return text.chars().mapToObj(c -> charToCode.get((char) c)).collect(Collectors.joining());
    }

    // This method is used to traverse from ROOT-to-LEAVES
    private static void postorder(Node n, String s) {
        if (n == null)
            return;

        postorder(n.left, s + "0");
        postorder(n.right, s + "1");

        // Visit only nodes with keys
        if (n.isLeaf) {
            charToCode.put(n.value, s);
//            codeToChar.put(s, n.value);
        }
    }

    private static Node buildEncodingTree(PriorityQueue<Node> priorityQueue) {
        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            priorityQueue.add(new Node(left.weight + right.weight, left, right));
        }
        return priorityQueue.peek();
    }

    private static Map<Character, Integer> buildcharFrequencyMap(char[] array) {
        HashMap<Character, Integer> resultMap = new HashMap<>();

        for (char val : array) {
            Integer counter = resultMap.get(val);
            if (resultMap.containsKey(val)) {
                counter = ++counter;
            } else {
                counter = 1;
            }
            resultMap.put(val, counter);
        }
        return resultMap;
    }

    private static class Node implements Comparable<Node> {

        private char value;
        private int weight;
        private Node left;
        private Node right;
        private boolean isLeaf;

        public Node(char value, int weight) {
            this.value = value;
            this.weight = weight;
            this.isLeaf = true;
        }

        public Node(int weight, Node left, Node right) {
            this.weight = weight;
            this.left = left;
            this.right = right;
        }

        public int compareTo(Node n) {
            return Integer.compare(this.weight, n.weight);
        }

    }

}
