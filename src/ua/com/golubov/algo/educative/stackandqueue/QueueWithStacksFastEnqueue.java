package ua.com.golubov.algo.educative.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueWithStacksFastEnqueue<T> implements Queue<T> {

    private Deque<T> stack1 = new LinkedList<>();
    private Deque<T> stack2 = new LinkedList<>();

    public void enqueue(T val) {
        stack1.push(val);
    }

    public T dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new IllegalStateException();
        }

        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
