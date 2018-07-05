package com.Exilant.Day1_Task;

public class SumOfDigits {

	public static void main(String[] args) {
		int [] arr= {1,2,1,1,1};
		CircularLinkedList ll=new CircularLinkedList();
		for(int i=0;i<arr.length;i++)
		{
			ll.insert(arr[i]);
		}
		ll.display();
		
	}

}
