package com.demo.linkedlist;

public class DoublyLinkedList {
        Node head;
        class Node{
        	int data;
        	Node prev;
        	Node next;
			public Node(int data) {
				super();
				this.data = data;
				this.prev = null;
				this.next = null;
			}
        	
        }
		public DoublyLinkedList() {
			this.head = null;
		}
		
		//add at the end of doubly linked list
		public void addNode(int val) {
			Node newNode=new Node(val);
			if(head==null) {
				head=newNode;
			}else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
				newNode.prev=temp;
			}
		}
		
		
		public void addByPosition(int pos,int val) {
			Node newNode=new Node(val);
			if(pos==1) {
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
				
			}else {
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newNode.next=temp.next;
					newNode.prev=temp;
					
					if(temp.next!=null) {
						temp.next.prev=newNode;
					}
					temp.next=newNode;
				}else {
					System.out.println("position is out of scope");
				}
				
			}
			
		}
		public void addAfterNumber(int num,int val) {
			 if(head==null) {
				 System.out.println("list is empty");
				 
			 }else {
				 Node newNode=new Node(val);
				 Node temp=head;
				 while(temp!=null && temp.data!=num) {
					 temp=temp.next;
				 }
				 if(temp.data==num) {
					 newNode.next=temp.next;
					 newNode.prev=temp;
					 if(temp.next!=null) {
						 temp.next.prev=newNode;
					 }
					 temp.next=newNode;
					 
				 }
			 }
		}
		
		public void deleteByNum(int num) {
			if(head==null) {
				System.out.println("list is empty");
			}else {
				Node temp=head;
				//delete from the begining
				if(head.data==num) {
					 head.next.prev=null;
					 head=head.next;
					 temp.next=null;
				}else {
			
				while(temp!=null && temp.data!=num) {
					temp=temp.next;
				}
				//delete from middle or from the end
				if(temp!=null) {
					temp.prev.next=temp.next;
					//do this only if the temp is not last node
					if(temp.next!=null) {
					      temp.next.prev=temp.prev;
					}
					temp.next=null;
					temp.prev=null;
				}else {
					System.out.println(num+"not found");
				}
				}
			}
		}
	 public void deleteByPosition(int pos) {
		 if(head==null) {
				System.out.println("list is empty");
			}else {
				Node temp=head;
				if(pos==1) {
					head.next.prev=null;
					head=head.next;
					temp.next=null;
				}else {
				
				for(int i=1;temp!=null && i<=pos-1;i++) {
					  temp=temp.next;
				}
				if(temp!=null) {
					temp.prev.next=temp.next;
					if(temp.next!=null) {
					      temp.next.prev=temp.prev;
					}
					temp.next=null;
					temp.prev=null;
				}else {
					System.out.println(pos+"is beyond th limit");
				}
				}
			}
		}
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			for(Node temp=head; temp!=null;temp=temp.next) {
				System.out.print(temp.data+"---->");
			}
			System.out.println("null");
		}
	}
	public void displayreverse() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			for(;temp!=null;temp=temp.prev) {
				System.out.println(temp.data+"--->");
			}
			System.out.println("null");
		}
	}
		
        
}
