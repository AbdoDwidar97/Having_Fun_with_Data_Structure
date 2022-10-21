package test;
import ds.linkedlist.LinkedList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class linkedlist_test
{
    @Test
    public void _testAddItem()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Ahmed Mohamed");

        assertEquals(3, linkedList.length());
    }

    @Test
    public void _testRemoveItem()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Ahmed Mohamed");

        linkedList.removeAt(2);
        System.out.println(linkedList);

        assertEquals(2, linkedList.length());
    }

    @Test
    public void _testGetItem()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Ahmed Mohamed");

        assertEquals("Mohamed", linkedList.get(1));
    }

    @Test
    public void _testSetItem()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Ahmed Mohamed");

        linkedList.setAt(2, "Ali Emad");
        System.out.println(linkedList);

        assertEquals("Ali Emad", linkedList.get(2));
    }

    @Test
    public void _testInsertItem()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Ahmed Mohamed");

        linkedList.insert(2, "Ali Emad");
        System.out.println(linkedList);

        assertEquals("Ali Emad", linkedList.get(2));
    }

}
