package com.nag.dll;



/**
 * 
 * @author NAGESH
 * 
 *	 I am building Doubly Linked List data structures
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
 */
public class DoublyLinkedList {

	// first reference will point to the first node of the list
	private Node first;

	// Last reference will point to the last node of the list
	private Node last;


	public void display()
	{
		System.out.println("");
		if(first==null)
		{
			System.out.println("List is empty, Sorry\n");
		}
		else
		{
			Node temp=first;
			while(temp!=null)
			{
				System.out.print(temp.toString());
				temp=temp.right;
			}
			System.out.println("\n");
		}
	}


	public void insertAtTheBegining(int data)
	{
		// irrespective of the list length, we need to insert. Let me create the object first
		Node block=new Node(data);

		if(first==null)
		{
			// list is empty

			first=block;
			last=block;
		}
		else
		{
			block.right=first;
			first.left=block;

			first=block;

			// this is not necessary, i am simply planning to remove unused references
			block=null;
		}
	}


	public void insertAtTheEnd(int data)
	{
		// irrespective of the list length, we need to insert. Let me create the object first
		Node block=new Node(data);
		if(first==null)
		{
			// list is empty
			first=block;
			last=block;
		}
		else
		{
			last.right=block;
			block.left=last;

			// this is not necessary, i am simply planning to remove unused references
			block=null;
		}
	}


	public void insertAfterAnElement(int key,int data)
	{
		if(first==null)
		{
			// list is empty
			System.out.println("Sorry, Reference Element not found. Unable to insert");
		}
		else
		{


		}
	}






}
