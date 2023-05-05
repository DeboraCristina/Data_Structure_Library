package br.fatec.SetObject;

public interface InterfaceSetObject
{
    public boolean isEmpty();
    public int size();
    public void addFirst(Object value) throws Exception;
    public void addLast(Object value) throws Exception;
    public void add(Object value, int index) throws Exception;
    public void removeFirst() throws Exception;
    public void removeLast() throws Exception;
    public void remove(int index) throws Exception;
    public Object get(int index) throws Exception;
}
