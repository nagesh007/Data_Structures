import java.util.Scanner;

import com.nag.dll.DoublyLinkedList;


public class MyMain {

	public static void main(String[] args) {
		
		System.out.println("***********************************************");
		System.out.println(" Welcome to Doubly Linked List Data Structure ");
		System.out.println("***********************************************");
		Scanner scanner=new Scanner(System.in);
		DoublyLinkedList list =new DoublyLinkedList();
		while(true)
		{
			System.out.println("\n1 : Insert at the begining\n"
					+ "2 : Insert at the end\n"
					+ "3 : Insert after an element\n"
					+ "4 : Display\n"
					+ "5 : Reverse\n"
					+ "6 : Delete fisrt element\n"
					+ "7 : Delete last element\n"
					+ "8 : Delete a particular element\n"
					+ "9 : Exit\n");
			System.out.println("Please Enter your choice");
			int choice= scanner.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Please enter the number");
				 		int num=scanner.nextInt();
				 		list.insertAtTheBegining(num);
				 		break;
				 		
				case 2: System.out.println("Please enter the number");
		 				int number=scanner.nextInt();
		 				list.insertAtTheEnd(number);
		 				break;
		 				
				case 3: System.out.println("Please enter the number which has to be inserted");
						int val=scanner.nextInt();
						
						System.out.println("Please enter the reference element");
						int key=scanner.nextInt();
						
						list.insertAfterAnElement(key,val);
						break;
						
				case 4: list.display();
						break;
						
				case 5: 
						list.reverse();
						break;
						
				case 6:
//						list.deleteAtTheBegining();
						break;
				
				case 7:
//						list.deleteAtTheEnd();
						break;
						
				case 8: System.out.println("Please enter the number which u want to delete");
		 		        int numberToBeDeleted=scanner.nextInt();
//		 		        list.deleteAParticularElement(numberToBeDeleted);
		 		        break;
					
		 		
				default : System.out.println("\nThanks for using Linked List\n");
						  scanner.close();
						  System.exit(0);
			
			}
			
			
		}
		
		
	

	}

}
