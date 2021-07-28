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
			System.out.print("List items : ");
			Node temp=first;
			while(temp!=null)
			{
				System.out.print("\t"+temp.getData()+" -> ");
				temp=temp.getNext();
			}
			System.out.println("null\n");
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

			Node obj=new Node (dataToBeInserted,null);

			Node temp=first;
			while(temp!=null && temp.getData()!=element)
			{
				temp=temp.getNext();
			}


			if(temp==null)
			{
				// item not found , so i can't insert
				System.out.println("Sorry, I was not able to find the reference element. Unable to insert new data ");
				return;
			}

			/*
			 * Currently "temp" is exactly pointing to the required node
			 * 
			 * There are 2 scenarios
			 * ------------------------
			 *    
			 *     - Required node ("temp" pointing one) might be the last node
			 *     - Required node might be somewhere in the middle
			 *     
			 *     Below code will work for both scenarios
			 */


			obj.setNext(temp.getNext());
			temp.setNext(obj);

			// this is not necessary, i am simply planning to remove unused references
			obj=null;
		}
	}


	public void reverseWithoutCreatingNewList()
	{

		if(first==null)
		{
			// Empty List
			System.out.println("List is empty, sorry I can't reverse");
			return;
		}

		if(first.getNext()==null)
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
			/*
			 *  I will take 3 temporary references old, current and future
			 *  I will play with current reference.
			 */

			Node old=null;
			Node current=first;
			Node future=first.getNext();

			while(future.getNext()!=null)
			{
				current.setNext(old);

				old=current;
				current=future;
				future=future.getNext();
			}

			current.setNext(old);
			future.setNext(current);

			// important step
			first=future;

			// this is not necessary, i am simply planning to remove unused references
			old=null;
			current=null;
			future=null;
		}
		System.out.println("Reversing is done...\n");
	}


	public void deleteAtTheBegining()
	{

		if(first==null)
		{
			System.out.println("Sorry, Unable to Delete since List is empty");
			return;
		}

		if(first.getNext()==null)
		{
			// if there is only one element, then 
			// first will point to null and block(Node object) is left to Garbage Collector
			first=null;
		}
		else
		{		
			Node temp=first.getNext();

			// Detach
			first.next=null;

			// shift first to second node, 1st block(node) is left for garbage collector
			first=temp;
		}
		
		System.out.println("Node at the Begining was deleted\n");

	}


	public void deleteAtTheEnd()
	{
		if(first==null)
		{
			System.out.println("Sorry, Unable to Delete since List is empty");
			return;
		}

		if(first.getNext()==null)
		{
			// if there is only one element, then 
			// first will point to null and block(Node object) is left to Garbage Collector
			first=null;
		}
		else
		{
			Node temp=first;

			// I will traverse till last but 1 node
			while(temp.getNext().getNext()!=null)
			{
				temp=temp.getNext();
			}

			// now "temp" is pointing to the last but one node
			temp.setNext(null);

			// last node is left to garbage collector
		}
		
		System.out.println("Node at the end was deleted\n");
		
	}


	public void deleteAParticularElement(int numberToBeDeleted) {

		if(first==null)
		{
			System.out.println("Sorry, Unable to Delete since List is empty");
			return;
		}

		// if there is only one element
		if(first.getNext()==null)
		{
			
			System.out.println("First Node value :"+first.getData());
			System.out.println("To be deleted :"+numberToBeDeleted);
			
			if(first.getData()==numberToBeDeleted)
			{
				// Deleting : first will point to null and block(Node object) is left to Garbage Collector
				first=null;
				System.out.println(numberToBeDeleted+" number deleted\n");
			}
			else
			{
				System.out.println("Sorry, Element not found so unable to delete");
			}
		}
		else
		{
			if(first.getData()==numberToBeDeleted)
			{
				first=first.getNext();
				System.out.println(numberToBeDeleted+" number deleted\n");
				return;
			}
			
			
			Node temp=first;
			
			while(temp.getNext()!=null && temp.getNext().getData()!=numberToBeDeleted)
			{
				temp=temp.getNext();
			}
			if(temp.getNext()==null)
			{
				System.out.println("Sorry, Element not found so unable to delete");
			}
			else
			{
				/*
				 *  Now "temp" will be pointing to the previous node
				 */
				Node trash=temp.getNext();
				temp.setNext(trash.getNext());
				
				// this is not necessary, i am simply planning to remove unused references
				temp=null;
				trash=null;
				
				System.out.println(numberToBeDeleted+" number deleted\n");
				
			}
		}
	}




}
