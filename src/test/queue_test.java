package test;
import ds.queue.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class queue_test
{
    Queue<String> queue = new Queue<>(new String[]{"Samy", "Samir", "Bilal", "Abanoub"});

    @Test
    public void _testIsEmptyQueue()
    {
        Queue<String> q2 = new Queue<>();
        assertTrue(q2.isEmpty());

        assertFalse(queue.isEmpty());
    }

    @Test
    public void _testContainItem()
    {
        assertTrue(queue.contains("Samir"));
        assertFalse(queue.contains("Abdo"));
    }

    @Test
    public void _testEnqueueItem()
    {
        queue.enqueue("Abdo");
        assertTrue(queue.contains("Abdo"));
    }

    @Test
    public void _testPeekItem()
    {
        assertEquals("Samy", queue.peek());
    }

    @Test
    public void _testDequeueItem()
    {
        assertEquals("Samy", queue.dequeue());
        assertFalse(queue.contains("Samy"));
    }
}
