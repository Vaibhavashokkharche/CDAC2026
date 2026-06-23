package com.demo.test;

import com.demo.linkedlist.CircullarSinglyLinkedList;

public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {
	 CircullarSinglyLinkedList lst=new CircullarSinglyLinkedList();
	 lst.addNode(1);
	 lst.addNode(2);
	 lst.addNode(3);
	 lst.addNode(4);
	 lst.displayData();
	 lst.addAfterNum(2, 10);
	 lst.addAfterNum(4, 10);
	 System.out.println("after addAfterNum 2-10 and 4-10");
	 lst.displayData();
	 lst.addByPosition(1, 100);
	 lst.addByPosition(4, 100);
	 System.out.println("after addByPosition 1-100 and 4-100");
	 lst.displayData();
	 lst.deleteByPosition(1);
	 lst.deleteByPosition(3);
	 System.out.println("after delete by position 1 and 3");
	 lst.displayData();
	 lst.deleteByVal(3);
	 lst.deleteByVal(100);
	 System.out.println("after delete by value 3 and 100");
	 lst.displayData();
	 


	}

}
