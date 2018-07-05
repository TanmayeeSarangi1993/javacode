package com.Exilant.Day1_Task;

public class CircularLinkedList {
	
	public static int size;
	public static Node start;
	public static Node end;
	

	
	public void insert(int data)
	{
		Node n=new Node(data,start);
	
		if(start==null)
		{
			
			start=n;
			end=n;
			n.setLink(start);
		}
	else
		{
		end.setLink(n);
		n.setLink(start);
		end=n;
     	}
		size++;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void display()
	{
		Node temp=start;
		System.out.println("data is");
		System.out.println(start.getData());
		
		temp=temp.getLink();
		
		
		while(temp!=start)
			
		{
			System.out.println(temp.getData());
			temp=temp.getLink();
		}
	}
	
//	public long getSum()
//	{Node temp=start;
//	Node prev;
//	while(temp.getLink()!=start)
//	{
//		
//	}
//		
//	}

}
