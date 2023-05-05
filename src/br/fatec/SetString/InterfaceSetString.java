package br.fatec.SetString;

public interface InterfaceSetString
{
    public boolean isEmpty();

    public int size();

    public void addFirst(String value) throws Exception;
;
    public void addLast(String value) throws Exception;
;
    public void add(String value, int index) throws Exception;
;
    public void removeFirst() throws Exception;
;
    public void removeLast() throws Exception;
;
    public void remove(int index) throws Exception;
;
    public String get(int index) throws Exception;
}
