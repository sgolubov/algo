package ua.com.golubov.algo.educative.stackandqueue.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.stackandqueue.Stack;
import ua.com.golubov.algo.educative.stackandqueue.StackWithQueuesFastPop;
import ua.com.golubov.algo.educative.stackandqueue.StackWithQueuesFastPush;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void shouldPushFast() {
        checkStack(new StackWithQueuesFastPush<>());
    }

    @Test
    public void shouldPopFast() {
        checkStack(new StackWithQueuesFastPop<>());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowException1() {
        shouldThrowExceptionForEmptyStack(new StackWithQueuesFastPush<>());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowException2() {
        shouldThrowExceptionForEmptyStack(new StackWithQueuesFastPop<>());
    }

    private void checkStack(Stack<Integer> stack) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        stack.push(4);
        assertEquals(4, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
    }

    private void shouldThrowExceptionForEmptyStack(Stack<Integer> stack) {
        stack.pop();
    }

}