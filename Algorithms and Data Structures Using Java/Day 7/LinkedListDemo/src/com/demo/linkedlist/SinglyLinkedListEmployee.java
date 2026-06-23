package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyLinkedListEmployee {
	Node head;
	class Node{
		Employee data;
		Node next;
		public Node(Employee data) {
			this.data = data;
			this.next = null;
		}
		
	}
	public SinglyLinkedListEmployee() {
		this.head = null;
	}
	
	//it should add at the end
	public void addNode(Employee ob) {
		Node newNode=new Node(ob);
		//add at the head position if list is empty
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null ) {
				temp=temp.next;
			}
			//add after last node
			temp.next=newNode;
		}
	}
	//add after given id
	public void addAfterGivenId(Employee ob,int eid) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			Node newNode=new Node(ob);
			while(temp!=null && temp.data.getEid()!=eid) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("eid not found");
			}
			
		}
		
	}
	//add at the given position
	public void addByPosition(int pos,Employee ob) {
		Node newNode=new Node(ob);
		if(pos==1) {
			newNode.next=head;
			head=newNode;
		}else {
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("position is out of scope");
			}
		}
	}
	public Employee deleteByPos(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(pos==1) {
				head=head.next;
				temp.next=null;
			}else {
				Node prev=null;
				for(int i=1;temp!=null && i<=pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					return temp.data;
				}else {
					System.out.println("position is out of scope");
					return null;
				}
			}
			
		}
		return null;
	}
	public void deleteById(int eid) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
		 Node temp=head;
		 if(head.data.getEid()==eid) {
			 head=temp.next;
			 temp.next=null;
		 }else {
			 Node prev=null;
			 while(temp!=null && temp.data.getEid()!=eid) {
				 prev=temp;
				 temp=temp.next;
			 }
			 if(temp!=null) {
				 prev.next=temp.next;
				 temp.next=null;
			 }else {
				 System.out.println(eid+" not found");
			 }
		 }
		}
	}
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
			System.out.println("null");
		}
	}

}
