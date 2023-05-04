package br.fatec.ListObject;

public class ListObject implements InterfaceListObject
{
	Node start;

	public ListObject()
	{
		this.start = null;
	}

	@Override
	public boolean isEmpty()
	{
		return (start == null);
	}

	@Override
	public int size()
	{
		int count = 0;
		if (!isEmpty())
		{
			Node temp = start;

			while (temp != null)
			{
				count ++;
				temp = temp.next;
			}
		}
		return count;
	}

	private Node getNode(int index) throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");
		int size = size();
		if (index < 0 || index >= size)
			throw new Exception("Invalid index");

		Node temp = start;
		for (int i = 0; i < index; i++)
			temp = temp.next;
		return temp;
	}

	@Override
	public Object get(int index) throws Exception
	{
		Node node = (Node) getNode(index);

		return node.data;
	}
	@Override
	public void addFirst(Object value)
	{
		Node newElement = new Node();
		newElement.data = value;
		newElement.next = start;
		start = newElement;
	}

	@Override
	public void addLast(Object value) throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");

		Node newElement = new Node();
		Node lastNode = (Node) getNode(size() - 1);
		newElement.data = value;
		lastNode.next = newElement;
	}

	@Override
	public void add(Object value, int index) throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");

		int size = size();
		if (index < 0 || index >= size)
			throw new Exception("Invalid index");

		if (index == 0)
			addFirst(value);
		else if (index == size)
			addLast(value);
		else
		{
			Node newElement = new Node();
			Node backNode = (Node) getNode(index-1);

			newElement.data = value;
			newElement.next = backNode.next;
			backNode.next = newElement;
		}
	}

	@Override
	public void removeFirst() throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");

		start = start.next;
	}

	@Override
	public void removeLast() throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");

		int size = size();
		if (size == 1)
			removeFirst();
		else
		{
			Node penultimateNode = (Node) getNode(size() - 2);
			penultimateNode.next = null;
		}
	}

	@Override
	public void remove(int index) throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");
		int size = size();
		if (index < 0 || index >= size)
			throw new Exception("Empty List");

		if (index == 0)
			removeFirst();
		else if (index == size-1)
			removeLast();
		else
		{
			Node backNode = getNode(index-1);
			backNode.next = backNode.next.next;
		}
	}
}
