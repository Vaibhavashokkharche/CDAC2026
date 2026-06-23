package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyLinkedListEmployee;

public class TestSinglyLinkedListEmployee {

	public static void main(String[] args) {
	SinglyLinkedListEmployee lst=new SinglyLinkedListEmployee();
	lst.addNode(new Employee(12,"Ashu",56789));
	lst.addNode(new Employee(13,"Amit",57789));
	lst.addNode(new Employee(14,"Meena",46789));
	lst.addNode(new Employee(15,"Radha",36789));
	lst.displayData();
	lst.addAfterGivenId(new Employee(11,"Tanaya",45678), 12);
	lst.addAfterGivenId(new Employee(17,"Kanchan",44678), 15);
	lst.displayData();
	lst.addByPosition(1, new Employee(10,"arti",45454));
	lst.addByPosition(5,new Employee(21,"Ajay",75757));
    lst.displayData();
    lst.deleteById(14);
    lst.deleteById(10);
    lst.displayData();
    lst.deleteByPos(1);
    lst.deleteByPos(4);
    lst.displayData();
	}

}
