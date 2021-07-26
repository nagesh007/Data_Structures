import java.util.Scanner;

import com.nag.ll.LinkedList;

public class MyMain {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Linked List Data Structure");
		Scanner scanner=new Scanner(System.in);
		LinkedList list =new LinkedList();
		while(true)
		{
			System.out.println("1 : Insert at the begining\n"
					+ "2 : Insert at the end\n"
					+ "3 : Insert after an element\n"
					+ "4 : Display\n"
					+ "5 : Reverse\n"
					+ "6 : Remove fisrt element\n"
					+ "7 : Remove last element\n"
					+ "8 : Remove a particular element\n"
					+ "\n"
					);
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
					
					System.out.println("Please enter the reference element ");
					int key=scanner.nextInt();
					
					list.insertAfterAnElement(key,val);
					break;
					
			case 4: list.display();
					break;
			
			}
			
			
		}
		
	

	}

}
