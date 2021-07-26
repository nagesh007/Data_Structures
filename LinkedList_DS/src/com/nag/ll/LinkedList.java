package com.nag.ll;


/**
 * 
 * @author NAGESH
 * 
 *   I am building Linked List data structures
 *   
 *   I will be providing many API for Linked List Operations
 *   
 *   -Insert
 *   -Delete
 *   -Sort
 *   -Search
 *   -Update
 *   -Merge
 *   -Reverse
 *   
 *
 */
public class LinkedList {

	// first holds the reference to LL
	private Node first;
	
	/**********************APIs*********************/
	
	public void display()
	{
		if(first==null)
		{
			System.out.println("Linked List is empty.");
		}
		else
		{
			Node temp=first;
			while(temp!=null)
			{
				System.out.println("\t"+temp.getData());
				temp=temp.getNext();
			}
			System.out.println("\n");
		}
	}
	
	
	public void insertAtTheBegining(int n)
	{
		
		Node obj=new Node(n, null);
		if(first==null)
		{
			first=obj;
			
			// this is not necessary, i am simply planning to remove unused references
			obj=null;
		}
		else
		{
			obj.setNext(first);
			first=obj;
			
			// this is not necessary, i am simply planning to remove unused references
			obj=null;
			
		}
	}
	
	public void insertAtTheEnd(int n)
	{
		
		Node obj=new Node(n, null);
		if(first==null)
		{
			first=obj;
			
			// this is not necessary, i am simply planning to remove unused references
			obj=null;
		}
		else
		{
			Node temp=first;
			
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			
			temp.setNext(obj);
			
			// this is not necessary, i am simply planning to remove unused references
			obj=null;
			
		}
	}
	
	/**
	 * 
	 * @param element
	 * 
	 * 			Required Node (aka Key element), after which element is inserted
	 * 
	 * @param dataToBeInserted
	 * 	    
	 * 			Data to be inserted
	 * 			
	 */
	public void insertAfterAnElement(int element,int dataToBeInserted)
	{
		
		if(first==null)
		{
			System.out.println("List is empty, I can't insert");
		}
		else
		{
			
			// if list is empty then creating an object is waste
			Node obj=new Node (dataToBeInserted,null);
			
			
			Node temp=first;
			while(temp.getData()!=element)
			{
				temp=temp.getNext();
			}
			
			/*
			 * Currently temp is exactly pointing to the required node
			 * 
			 * There are 2 scenarios
			 * ------------------------
			 *    
			 *     - Required node (temp pointing one) might be the last node
			 *     - Required node is not the last node
			 */
			
			
			
			if(temp.getNext()==null)
			{
				//Scenario 1 : Required node is last node
				temp.setNext(obj);
				
				
				// this is not necessary, i am simply planning to remove unused references
				obj=null;
			}
			else
			{
				// Scenario 2 
				
				
				obj.setNext(temp.getNext());
				temp.setNext(obj);
				
				// this is not necessary, i am simply planning to remove unused references
				obj=null;
				
			}
			
			
		}
	}
	
	
	public void reverseWithoutCreatingNewList()
	{
		
		
		if(first==null)
		{
			// Empty List
			System.out.println("List is empty, sorry I can't reverse");
		}
		else if(first.getNext()==null)
		{
			// If list size is 1 , There is nothing to reverse
		}
		else if(first.getNext().getNext()==null)
		{
			// Above condition tells that there are only 2 elements
			
			Node second=first.getNext();
			
			second.setNext(first);
			first.setNext(null);
			
			first=second;
		}
		else
		{
			
			Node head=first.getNext();
			Node temp=first;
			Node prev=null;
			
			while(head.getNext()!=null)
			{
				temp.setNext(prev);
				prev=temp;
				temp=head;
				head=head.getNext();
			}
			
			temp.setNext(prev);
			head.setNext(temp);
			
			first=head;
			
			// this is not necessary, i am simply planning to remove unused references
			temp=null;
			head=null;
			prev=null;
			
		}
	}
	
	
}
