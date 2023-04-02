package br.fatec.StackInt;

public class Node
{
    public int data;
    public Node next;

    @Override
    public String toString() {
        return "data=" + data + "next=" + next.toString();
    }
}
