package br.fatec.QueueInt;

public class QueueInt
{
	Node init;
	Node end;
	
	public QueueInt()
	{
		this.init = null;
		this.end= null;
	}
	
	public boolean isEmpty()
	{
		return (init == null && end == null);
	}
	
	public void insert(int newData)
	{
		Node node = new Node();
		node.data = newData;
		
		if (init == null)
		{
			init = node;
			end= node;
		}
		else if (init == end)
		{
			end = node;
			init.next = end;
		}
		else
		{
			end.next = node;
			end = node;
		}
	}
	
	public int remove() throws Exception
	{
		int value = 0;
		
		if (isEmpty())
			throw new Exception ("is empty");
		
		if (init == end)
		{
			value = init.data;
			init = null;
			end = null;
		}
		else
		{
			value = init.data;
			init = init.next;
		}
		return value;
	}
	
	public int size()
	{
		int size = 0;
		
		if (!isEmpty())
		{
			Node node = init;
			
			while (node != null)
			{
				size++;
				node = node.next;
			}
		}
		return size;
	}

	public int[] getElements () throws Exception
	{
		int size = size();
		int[] elements = new int[size];
		if (size > 0)
		{
			Node node = init;
		
			for (int i = 0; i < size; i++)
			{
				elements[i] = node.data;
				node = node.next;
			}
		}
		else
			throw new Exception ("vector is empty");
		return elements;
	}
	
	@Override
	public String toString() 
	{
		StringBuffer queue = new StringBuffer();
		
		Node node = init;
		
		while (node != null)
		{
			queue.append(" [");
			queue.append(node.toString());
			queue.append("] ");
			node = node.next;
		}
		return queue.toString();
	}
}
