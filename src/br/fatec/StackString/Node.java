package br.fatec.StackString;

public class Node
{
    public String data;
    public Node next;

    @Override
    public String toString() {
        return "data=" + data + "next=" + next.toString();
    }
}
