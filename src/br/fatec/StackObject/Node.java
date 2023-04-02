package br.fatec.StackObject;

public class Node
{
    public Object data;
    public Node next;

    @Override
    public String toString() {
        return "data=" + data + "next=" + next.toString();
    }
}
