import queue.Queue;

public class Main
{
    public static void main(String[] args)
    {
        /* /// LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Ahmed Mohamed");

        linkedList.removeAt(1);
        linkedList.setAt(0, "Ali");
        linkedList.insert(1, "Emad");

        System.out.println(linkedList + " ,Size: " + linkedList.length());
        System.out.println(linkedList.get(0));*/

        /// Queue
        Queue<String> queue = new Queue<>();
        queue.add("Ahmed");
        queue.add("Ali");
        queue.add("Hosny");

        while (!queue.isEmpty())
        {
            System.out.println(queue.pop());
        }
    }

}
