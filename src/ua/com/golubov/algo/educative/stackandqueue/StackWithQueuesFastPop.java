package ua.com.golubov.algo.educative.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueuesFastPop<T> implements Stack<T> {

    private Queue<T> queue1 = new LinkedList<>();
    private Queue<T> queue2 = new LinkedList<>();

    @Override
    public void push(T val) {
        if (queue1.isEmpty()) {
            queue1.add(val);
        } else {
            queue2.add(val);
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }

            Queue<T> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }
    }

    @Override
    public T pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException();
        }
        return queue1.remove();
    }
}
