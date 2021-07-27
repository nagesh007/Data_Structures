package com.nag.ll;

public class Node {

	int data;
	
	Node next;

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
