package ua.com.golubov.algo.stepik;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Heap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<String> entries = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            entries.add(in.nextLine());
        }

        entries.forEach(input -> {
            String[] operation = input.split(" ");
            Operation op = Operation.valueOf(operation[0].toUpperCase());
            Integer val = operation.length > 1 ? Integer.valueOf(operation[1]) : null;

            switch (op) {
                case INSERT:
                    heap.add(val);
                    break;
                case EXTRACTMAX:
                    Integer max = heap.poll();
                    System.out.println(max);
                    break;
            }
        });

    }

    enum Operation {
        INSERT, EXTRACTMAX
    }


}
