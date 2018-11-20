package ua.com.golubov.algo.educative.stackandqueue.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.stackandqueue.Queue;
import ua.com.golubov.algo.educative.stackandqueue.QueueWithStacksFastDequeue;
import ua.com.golubov.algo.educative.stackandqueue.QueueWithStacksFastEnqueue;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void shouldDequeueFast() {
        checkQueue(new QueueWithStacksFastDequeue<>());
    }

    @Test
    public void shouldEnqueueFast() {
        checkQueue(new QueueWithStacksFastEnqueue<>());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowException1() {
        shouldThrowExceptionForEmptyQueue(new QueueWithStacksFastDequeue<>());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowException2() {
        shouldThrowExceptionForEmptyQueue(new QueueWithStacksFastEnqueue<>());
    }

    private void checkQueue(Queue<Integer> queue) {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue().intValue());
        assertEquals(2, queue.dequeue().intValue());
        queue.enqueue(4);
        assertEquals(3, queue.dequeue().intValue());
        assertEquals(4, queue.dequeue().intValue());
    }

    private void shouldThrowExceptionForEmptyQueue(Queue<Integer> queue) {
        queue.dequeue();
    }

}