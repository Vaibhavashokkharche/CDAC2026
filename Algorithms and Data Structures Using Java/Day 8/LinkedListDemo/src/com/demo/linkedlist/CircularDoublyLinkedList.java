package com.demo.linkedlist;

public class CircularDoublyLinkedList {
       Node head;
       class Node{
    	   int data;
    	   Node prev,next;
		   public Node(int data) {
			super();
			this.data = data;
			this.prev = null;
			this.next = null;
		   }
       }
	   public CircularDoublyLinkedList() {
		     this.head = null;
	   }
	  
	   public void addNode(int val) {
		   Node newNode=new Node(val);
		   //add at the head if list is empty
		   if(head==null) {
			   head=newNode;
			   newNode.next=head;
			   newNode.prev=head;
		   }else {
			   //add at the end if list is not empty
			   //place temp at the last node
			   Node temp=head.prev;
			   //add newNode after temp
			   newNode.next=head;
			   temp.next=newNode;
			   head.prev=newNode;
		   }
		   
	   }
	   
	   public void displayData() {
			Node temp=head;
			do {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}while(temp!=head);
			System.out.println();
		}
		
		public void displayDataReverse() {
			Node temp=head.prev;
			do {
				System.out.print(temp.data+"--->");
				temp=temp.prev;
			}while(temp!=head.prev);
			System.out.println();
		}
		
		public void addByPosition(int pos,int val) {
			if(head==null) {
				System.out.println("list is empty");
			}else {
				Node newNode=new Node(val);
				if(pos==1) {
					//place temp at the end
					Node temp=head.prev;
					newNode.next=head;
					newNode.prev=temp;
					head.prev=newNode;
					head=newNode;
					temp.next=newNode;
				}else {
					Node temp=head;
					//place temp at proper position , and add node after temp
					//add in between and add at the end
					int i=1;
					for(;temp.next!=head  && i<=pos-2;i++) {
						temp=temp.next;
					}
					if(i>pos-2) {
						newNode.prev=temp;
						newNode.next=temp.next;
						temp.next.prev=newNode;
						temp.next=newNode;
						
					}else {
						System.out.println(pos+"out of scope");
					}
					
				}
			}
		}
		public void addAfterNum(int num,int val) {
			if(head==null) {
				System.out.println("list is empty");
			}else {
				Node temp=head;
				Node newNode=new Node(val);
				while(temp.next!=head && temp.data!=num) {
					temp=temp.next;
				}
				if(temp.data==num) {
					newNode.prev=temp;
					newNode.next=temp.next;
					temp.next.prev=newNode;
					temp.next=newNode;
				}else {
					System.out.println(val+" not found");
				}
			}
		}
		
		public int deleteByPosition(int pos) {
			if(head==null) {
				System.out.println("list is empty");
				
			}else {
				if(pos==1) {
					//delete from the beginning and list has only one node
					if(head.next==head) {
						int n=head.data;
						head=null;
						return n;
					}else {
						//delete from the beginning and list has more than  one node
						Node temp=head;
						Node tail=head.prev;
						head=head.next;
						tail.next=head;
						head.prev=tail;
						temp.next=null;
						temp.prev=null;	
						return temp.data;
					}
				}else {
					Node temp=head;
					int i=1;
					for(;temp.next!=head && i<=pos-1;i++) {
						temp=temp.next;
					}
					if(i>pos-1) {
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						temp.prev=null;
						temp.next=null;
						return temp.data;
					}else {
						System.out.println(pos+" out of scope");
					}
				}
			}
			return -1;
		}
		
		public void deleteByValue(int val) {
			if(head==null) {
				System.out.println("list is empty");
				
			}else {
				if(head.data==val) {
					//delete from the beginning and list has only one node
					if(head.next==head) {
						head=null;
					}else {
						//delete from the beginning and list has more than  one node
						Node temp=head;
						Node tail=head.prev;
						head=head.next;
						tail.next=head;
						head.prev=tail;
						temp.next=null;
						temp.prev=null;	
					
					}
				}else {
					Node temp=head;
					int i=1;
					for(;temp.next!=head && temp.data!=val;i++) {
						temp=temp.next;
					}
					if(temp.data==val) {
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						temp.prev=null;
						temp.next=null;
						
					}else {
						System.out.println(val+" not found");
					}
				}
			}
		}

}
