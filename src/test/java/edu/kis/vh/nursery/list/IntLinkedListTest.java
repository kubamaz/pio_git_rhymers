package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {
    public static final int TEST_VALUE = 10;
    public static final int TEST_VALUE2 = 20;
    public static final int DEFAULT_RETURN = -1;

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(TEST_VALUE);

        Assert.assertEquals(TEST_VALUE, list.pop());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        list.push(TEST_VALUE);
        Assert.assertFalse(list.isEmpty());
        list.pop();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(DEFAULT_RETURN, list.top());
        list.push(TEST_VALUE);
        Assert.assertEquals(TEST_VALUE, list.top());
        list.push(TEST_VALUE2);
        Assert.assertEquals(TEST_VALUE2, list.top());

    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        list.push(TEST_VALUE);
        list.push(TEST_VALUE2);
        Assert.assertEquals(TEST_VALUE2, list.pop());
        Assert.assertEquals(TEST_VALUE, list.pop());
        Assert.assertEquals(DEFAULT_RETURN, list.pop());

    }
}