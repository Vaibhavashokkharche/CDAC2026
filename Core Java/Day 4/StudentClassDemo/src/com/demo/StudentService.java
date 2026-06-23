package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

public class StudentService {

	public static void addNewStudent(Student[] sarr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sarr.length;i++) {
			  System.out.println("enetr id");
			  int sid=sc.nextInt();  
			  sc.nextLine();
			  System.out.println("enter name");
			  String nm=sc.nextLine();
			  System.out.println("enetr marks 1");
			  float m1=sc.nextFloat();  
			  System.out.println("enetr marks 2");
			  float m2=sc.nextFloat();  
			  System.out.println("enetr marks 3");
			  float m3=sc.nextFloat();  
			  System.out.println("enter date (dd/MM/yyyy)");
			  String dt=sc.next();
			  //convert String to java date
			  SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			  Date jdt=null;
			  try {
				jdt=sdf.parse(dt);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  sarr[i]=new Student(sid,nm,m1,m2,m3,jdt);
		}
		
	}

	public static void Displayall(Student[] sarr) {
		for(Student s:sarr) {
			System.out.println(s);
		}
		//java 1.8
		Stream.of(sarr).forEach(s1->System.out.println(s1));
		Stream.of(sarr).forEach(System.out::println);
		
	}

}
