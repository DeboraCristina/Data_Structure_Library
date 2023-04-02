package br.fatec.StackObject;

public class StackObject
{
    private Node top;

    public StackObject()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return (top == null);
    }

    public void push(Object data)
    {
        Node node = new Node();
        node.data = data;

        if (!isEmpty())
            node.next = top;
        top = node;
    }

    public Object pop()
    {
        Object value = 0;
        if (!isEmpty())
        {
            value = top.data;
            top = top.next;
        }
        return value;
    }

    public Object top()
    {
        if (!isEmpty())
            return top.data;
        return 0;
    }

    public int size()
    {
        int counter = 0;
        if (!isEmpty())
        {
            Node node = top;
            counter++;
            while (node.next != null)
            {
                node = node.next;
                counter++;
            }
        }
        return counter;
    }
}
