package br.fatec.QueueString;

public class QueueString
{
	Node init;
	Node end;
	
	public QueueString()
	{
		this.init = null;
		this.end= null;
	}
	
	public boolean isEmpty()
	{
		return init == null && end == null;
	}
	
	public void insert(String newData)
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
	
	public String remove() throws Exception
	{
		String value = null;
		
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

	public String[] getElements () throws Exception
	{
		int size = size();
		String[] elements = new String[size];
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
			throw new Exception ("queue is empty");
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
			queue.append(node);
			queue.append("] ");
			node = node.next;
		}
		return queue.toString();
	}
}
