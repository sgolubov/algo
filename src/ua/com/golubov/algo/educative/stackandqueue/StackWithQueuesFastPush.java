package ua.com.golubov.algo.educative.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueuesFastPush<T> implements Stack<T> {

    private Queue<T> queue1 = new LinkedList<>();
    private Queue<T> queue2 = new LinkedList<>();

    @Override
    public void push(T val) {
        queue1.add(val);
    }

    @Override
    public T pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException();
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return queue2.remove();
    }


}
