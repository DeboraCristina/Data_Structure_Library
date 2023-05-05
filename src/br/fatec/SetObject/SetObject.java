package br.fatec.SetObject;

public class SetObject implements InterfaceSetObject
{
	Node start;

	public SetObject ()
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
		Node node = getNode(index);

		return node.data;
	}

	private boolean existNode(Node node)
	{
		Node temp = start;

		while (temp != null)
		{
			if (node.data == temp.data)
				return true;
			temp = temp.next;
		}
		return false;
	}

	@Override
	public void addFirst(Object value) throws Exception
	{
		Node newElement = new Node();
		newElement.data = value;
		if (existNode(newElement))
			throw new Exception(value + " already Exist in list");
		newElement.next = start;
		start = newElement;
	}

	@Override
	public void addLast(Object value) throws Exception
	{
		if (isEmpty())
			throw new Exception("Empty List");

		Node newElement = new Node();
		newElement.data = value;
		if (existNode(newElement))
			throw new Exception(value + " already Exist in list");
		Node lastNode = getNode(size() - 1);
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
			newElement.data = value;
			if (existNode(newElement))
				throw new Exception(value + " already Exist in list");
			Node backNode = getNode(index-1);

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
			Node penultimateNode = getNode(size() - 2);
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
