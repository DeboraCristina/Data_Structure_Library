package br.fatec.StackInt;

public class StackInt
{
    private Node top;

    public StackInt()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return (top == null);
    }

    public void push(int data)
    {
        Node node = new Node();
        node.data = data;

        if (!isEmpty())
            node.next = top;
        top = node;
    }

    public int pop()
    {
        int value = 0;
        if (!isEmpty())
        {
            value = top.data;
            top = top.next;
        }
        return value;
    }

    public int top()
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
