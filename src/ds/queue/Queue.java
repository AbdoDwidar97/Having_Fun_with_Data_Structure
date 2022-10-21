package ds.queue;

import ds.models.Node;

public class Queue<T>
{
    private int queueSize = 0;
    private Node<T> firstElement;
    private Node<T> lastElement = new Node<>();

    public Queue()
    {
        firstElement = lastElement;
    }

    public Queue(T[] array)
    {
        firstElement = lastElement;
        for (T t : array) enqueue(t);
    }

    public void enqueue(T val)
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

    public T dequeue()
    {
        if (queueSize == 0) return null;

        T value = firstElement.getValue();
        firstElement = firstElement.getNext();
        queueSize--;
        return value;
    }

    public T peek()
    {
        if (queueSize == 0) return null;
        return firstElement.getValue();
    }

    public boolean contains(T val)
    {
        if (this.isEmpty()) return false;
        return containsItem(val, firstElement);
    }

    private boolean containsItem(T val, Node<T> root)
    {
        if (root == null) return false;
        if (root.getValue().equals(val)) return true;

        return containsItem(val, root.getNext());
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
