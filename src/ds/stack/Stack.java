package ds.stack;

import ds.models.Node;

public class Stack<T>
{
    int stackSize = 0;
    Node<T> root = new Node<>();

    public int size()
    {
        return stackSize;
    }

    public boolean isEmpty()
    {
        return stackSize == 0;
    }

    public void push(T val)
    {
        if (root.getValue() == null) root = new Node<>(val, null);
        else {
            root = new Node<>(val, root);
        }

        stackSize++;
    }

    public boolean contains(T val)
    {
        if (isEmpty()) return false;
        return containsValue(val, root);
    }

    private boolean containsValue(T val, Node<T> root)
    {
        if (root == null) return false;
        if (root.getValue().equals(val)) return true;

        return containsValue(val, root.getNext());
    }

    public T pop()
    {
        T element = root.getValue();
        root = root.getNext();
        stackSize--;
        return element;
    }

    public T peek()
    {
        return root.getValue();
    }
}
