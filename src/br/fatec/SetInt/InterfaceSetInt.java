package br.fatec.SetInt;

public interface InterfaceSetInt
{
    public boolean isEmpty();

    public int size();

    public void addFirst(int value) throws Exception;
;
    public void addLast(int value) throws Exception;
;
    public void add(int value, int index) throws Exception;
;
    public void removeFirst() throws Exception;
;
    public void removeLast() throws Exception;
;
    public void remove(int index) throws Exception;
;
    public int get(int index) throws Exception;
}
