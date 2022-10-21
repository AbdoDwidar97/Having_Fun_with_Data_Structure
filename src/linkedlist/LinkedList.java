package linkedlist;

public class LinkedList <T>
{
    private int length = 0;
    private Node<T> root;
    public int length()
    {
        return length;
    }

    public void add(T val)
    {
        root = addItem(val, root);
    }
    private Node<T> addItem(T val, Node<T> root)
    {
        if (root == null)
        {
            root = new Node<T>(val, null);
            length++;
            return root;
        }

        root.setNext(addItem(val, root.getNext()));
        return root;
    }

    public T get(int i)
    {
        if (checkIndex(i)) return getAtIndex(i, 0, root);
        return null;
    }
    private T getAtIndex(int targetPosition, int currentPosition, Node<T> root)
    {
        if (targetPosition == currentPosition) return root.getValue();
        return getAtIndex(targetPosition, currentPosition + 1, root.getNext());
    }

    public void removeAt(int i)
    {
        if (checkIndex(i)) root = removeAtIndex(i, 0, root);
    }

    private Node<T> removeAtIndex(int targetPosition, int currentPosition, Node<T> root)
    {
        if (currentPosition == targetPosition)
        {
            length--;
            return root.getNext();
        }
        root.setNext(removeAtIndex(targetPosition, currentPosition + 1, root.getNext()));
        return root;
    }

    public void setAt(int i, T val)
    {
        if (checkIndex(i)) root = setAtIndex(i, 0, val, root);
    }

    private Node<T> setAtIndex(int targetPosition, int currentPosition, T val, Node<T> root)
    {
        if (currentPosition == targetPosition)
        {
            root.setValue(val);
            return root;
        }

        root.setNext(setAtIndex(targetPosition, currentPosition + 1, val, root.getNext()));
        return root;
    }

    public void insert(int i, T val)
    {
        if (checkIndex(i))
        {
            root = insertInto(i, 0, val, root);
        }
    }

    private Node<T> insertInto(int targetPosition, int currentPosition, T val, Node<T> root)
    {
        if (currentPosition == targetPosition)
        {
            length++;
            return new Node<T>(val, root);
        }

        root.setNext(insertInto(targetPosition, currentPosition + 1, val, root.getNext()));
        return root;
    }

    @Override
    public String toString()
    {
        return setStringVal(root, "[");
    }
    private String setStringVal(Node<T> root, String listVal)
    {
        if (root == null)
        {
            StringBuilder myString = new StringBuilder(listVal);
            myString.setCharAt(listVal.length() - 1, ']');
            return myString.toString();
        }
        listVal += root.getValue().toString();
        listVal += ",";
        return setStringVal(root.getNext(), listVal);
    }

    private boolean checkIndex(int i)
    {
        if (i >= length)
        {
            throw new IndexOutOfBoundsException("you are trying to access an element with index: " + i + ", on a list with size: " + length);
        }
        return true;
    }
}
