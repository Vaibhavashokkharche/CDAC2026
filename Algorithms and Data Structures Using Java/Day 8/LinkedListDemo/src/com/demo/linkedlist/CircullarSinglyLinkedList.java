package com.demo.linkedlist;

public class CircullarSinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	public CircullarSinglyLinkedList() {
		this.head = null;
	}
	
	//add at the end
	public void addNode(int val) {
		Node newNode=new Node(val);
		//list is empty so add at the begining
		if(head==null) {
			 head=newNode;
		}else {
			//list is not empty so place temp at the last node
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		newNode.next=head;
	}
	
	//add by position
	public void addByPosition(int pos,int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newNode=new Node(val);
			Node temp=head;
			if(pos==1) {
				//place the temp at the last node
				while(temp.next!=head) {
					temp=temp.next;
				}
				newNode.next=head;
				head=newNode;
				temp.next=head;
			}else {
				int i=1;
			    for(;temp.next!=head && i<=pos-2;i++) {
			    	temp=temp.next;
			    }	
			    if(i>pos-2) {
			    	newNode.next=temp.next;
			    	temp.next=newNode;
			    }else {
			    	System.out.println(pos+"is beyond the limit");
			    }
			}
		}
	}
	
	public void addAfterNum(int num,int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newNode=new Node(val);
			//check whether to add ater first node
			if(head.data==num) {
				newNode.next=head.next;
				head=newNode;
			}else {
				Node temp=head;
				do {
					temp=temp.next;
				}while(temp!=head && temp.data!=num);
				if(temp!=head) {
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println(num + " not found");
				}
			}
		}
	}
	
	public int deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
			return -1;
		}else {
			
			if(pos==1) {
				//delete from the begining and list has only one node
				if(head.next==head) {
					head=null;
				}else {
					//delete from the begining and list has more than one node
					Node temp=head;
					Node tail=head;
					//place tail at the last node
					while(tail.next!=head) {
						tail=tail.next;
					}
					head=temp.next;
					
					tail.next=head;
					temp.next=null;
					return temp.data;
				}
			}else {
				//add in between or add at the end
				Node temp=head;
				Node prev=null;
				int i=1;
				for(;temp.next!=head && i<=pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				//delete temp node
				if(i>pos-1) {
					prev.next=temp.next;
					temp.next=null;
					return temp.data;
				}else {
					System.out.println(pos+ " beyond the limit");
					return -1;
				}
			}
		}
		return -1;
		
	}
	
	public void  deleteByVal(int val) {
		if(head==null) {
			System.out.println("list is empty");
			
		}else {
			
			if(head.data==val) {
				//delete from the begining and list has only one node
				if(head.next==head) {
					head=null;
				}else {
					//delete from the begining and list has more than one node
					Node temp=head;
					Node tail=head;
					//place tail at the last node
					while(tail.next!=head) {
						tail=tail.next;
					}
					head=temp.next;	
					tail.next=head;
					temp.next=null;
					
				}
			}else {
				//add in between or add at the end
				Node temp=head;
				Node prev=null;
				int i=1;
				do {
					prev=temp;
					temp=temp.next;
				}while(temp!=head && temp.data!=val);
				//delete temp node
				if(temp.data==val) {
					prev.next=temp.next;
					temp.next=null;
					
				}else {
					System.out.println(val + " not found");
				
				}
			}
		}
	}
	
		public void displayData() {
			Node temp=head;
			do {
				System.out.print( temp.data+"---->");
				temp=temp.next;
			}while(temp!=head);
			System.out.println("null");
	}
}
