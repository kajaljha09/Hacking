package com.bst.implementation;

public class BinarySearchTreeImplementation {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static Node insert(Node root,int val) {
		if(root == null) {
			root=new Node(val);
			return root;
		}
		
		if(root.data > val) {
			//leftSubtree
			root.left=insert(root.left,val);
		}
		else {
			//right subTree
			root.right=insert(root.right,val);
		}
		return root;
	}
	//inorder
	public static void inorder(Node root) {
		if(root == null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	
	//preorder
	public static void preorder(Node root) {
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	//postorder
	public static void postorder(Node root) {
		if(root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		int values[]= {5,1,3,4,2,7};
		Node root=null;
		
		for(int i=0;i<values.length;i++) {
			root=insert(root,values[i]);
		}
		System.out.println("Root:-"+root.data);
		
		System.out.print("Inorder Traversal: ");
		inorder(root);
		System.out.println();
		
		System.out.print("Preorder Traversal: ");
		preorder(root);
		System.out.println();
		
		System.out.print("Postorder Traversal: ");
		postorder(root);
		System.out.println();
	}
}
