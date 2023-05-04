package br.fatec.ListString;

public interface InterfaceListString
{
    public boolean isEmpty();

    public int size();

    public void addFirst(String value);
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
