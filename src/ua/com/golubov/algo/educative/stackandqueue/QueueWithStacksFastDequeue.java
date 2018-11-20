package ua.com.golubov.algo.educative.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueWithStacksFastDequeue<T> implements Queue<T> {

    private Deque<T> stack1 = new LinkedList<>();
    private Deque<T> stack2 = new LinkedList<>();

    public void enqueue(T val) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(val);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public T dequeue() {
        if (stack1.isEmpty()) {
            throw new IllegalStateException();
        }

        return stack1.pop();
    }
}
