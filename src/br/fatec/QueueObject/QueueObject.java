package br.fatec.QueueObject;

public class QueueObject
{
	Node init;
	Node end;
	
	public QueueObject()
	{
		this.init = null;
		this.end= null;
	}
	
	public boolean isEmpty()
	{
		return init == null && end == null;
	}
	
	public void insert(Object newData)
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
	
	public Object remove() throws Exception
	{
		Object value = null;
		
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

	public void list()
	{
		if (!isEmpty())
		{
			Node node = init;

			while (node != null)
			{
				System.out.println(node.toString());
				node = node.next;
			}
		}
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
