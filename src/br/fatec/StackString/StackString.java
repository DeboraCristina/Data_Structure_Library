package br.fatec.StackString;

public class StackString
{
    private Node top;

    public StackString()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return (top == null);
    }

    public void push(String data)
    {
        Node node = new Node();
        node.data = data;

        if (!isEmpty())
            node.next = top;
        top = node;
    }

    public String pop()
    {
        String value = null;
        if (!isEmpty())
        {
            value = top.data;
            top = top.next;
        }
        return value;
    }

    public String top()
    {
        if (!isEmpty())
            return top.data;
        return null;
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
