package com.nag.dll;

public class Node {


	protected int data;

	protected Node left;

	protected Node right;

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node(int data) {
		this.data = data;
		this.left=null;
		this.right=null;
	}

	@Override
	public String toString() {

		String leftString=(left==null)?" null <- ":" <- ";
		String rightString=(right==null)?" -> null ":" -> ";
		return leftString+ data +rightString;
	}
}
