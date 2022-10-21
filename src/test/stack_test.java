package test;
import ds.stack.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class stack_test
{
    Stack<String> stack = new Stack<>();

    @Test
    public void _testIsEmptyStack()
    {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void _testPushStack()
    {
        stack.push("Ahmed");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void _testContainsStack()
    {
        stack.push("Ali");
        assertTrue(stack.contains("Ali"));
        assertFalse(stack.contains("Adam"));
    }

    @Test
    public void _testStackSize()
    {
        stack.push("Ali");
        stack.push("Emad");
        stack.push("Ahmed");

        assertEquals(3, stack.size());
    }

    @Test
    public void _testPopStack()
    {
        stack.push("Ali");
        stack.push("Emad");
        stack.push("Ahmed");

        assertEquals("Ahmed", stack.pop());
        assertEquals(2, stack.size());
        assertFalse(stack.contains("Ahmed"));
    }

    @Test
    public void _testPeekStack()
    {
        stack.push("Ali");
        stack.push("Emad");
        stack.push("Ahmed");

        assertEquals("Ahmed", stack.pop());
        assertEquals("Emad", stack.peek());

        assertEquals(2, stack.size());
        assertTrue(stack.contains("Emad"));
    }

}
