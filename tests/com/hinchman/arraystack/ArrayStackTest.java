package com.hinchman.arraystack;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ArrayStackTest {
    ArrayStack testStack = new ArrayStack(5);

    @Test
    public void testIsEmptyTrue(){
        assertTrue(testStack.isEmpty());
    }

    @Test
    public void testIsEmptyFalse(){
        testStack.push(5);
        assertFalse(testStack.isEmpty());
    }

    @Test
    public void testPush() {
        testStack.push(5);
        assertEquals(5, testStack.peek());
        testStack.push(10);
        assertEquals(10, testStack.peek());
        testStack.push(111);
        assertEquals(111, testStack.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testPop() {
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        assertEquals(3, testStack.pop());
        assertEquals(2, testStack.pop());
        assertEquals(1, testStack.pop());
        testStack.pop();
    }

    @Test
    public void peek() {
        testStack.push(5);
        assertEquals(5, testStack.peek());
    }

    @Test
    public void printStack() {
    }
}