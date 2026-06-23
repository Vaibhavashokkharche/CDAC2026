package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkdList {

	public static void main(String[] args) {
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.addNode(23);
		ob.addNode(20);
		ob.addNode(25);
		ob.addNode(21);
		ob.displayData();
		ob.addByPosition(1, 22);
		ob.addByPosition(3, 22);
		ob.displayData();
		ob.addAfterNumber(22, 31);
		ob.displayData();
		ob.deleteByPosition(1);
		ob.deleteByPosition(4);
		ob.displayData();
		ob.deleteByNum(22);
		ob.displayData();
		

	}

}
