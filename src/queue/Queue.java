package queue;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Queue<T>
{
    private int queueSize = 0;
    private Node<T> firstElement;
    private Node<T> lastElement = new Node<>();

    public Queue()
    {
        firstElement = lastElement;
    }
    public void add(T val)
    {
        if (queueSize == 0)
        {
            firstElement = new Node<>(val, null);
            lastElement = firstElement;
        }
        else {
            lastElement.setNext(new Node<>(val, null));
            lastElement = lastElement.getNext();
        }

        queueSize++;
    }

    public T pop()
    {
        if (queueSize == 0) return null;

        T value = firstElement.getValue();
        firstElement = firstElement.getNext();
        queueSize--;
        return value;
    }

    public int size()
    {
        return queueSize;
    }

    public boolean isEmpty()
    {
        return queueSize == 0;
    }
}
