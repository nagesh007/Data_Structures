package com.nag.ll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testInsertAtTheBegining() {
		
		
		LinkedList obj=new LinkedList();
		
		obj.insertAtTheBegining(5);
		
		assertEquals(5, obj.getFirstElement());
		
	}

}
