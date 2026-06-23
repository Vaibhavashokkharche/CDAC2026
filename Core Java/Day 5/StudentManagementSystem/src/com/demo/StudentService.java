package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {
	   static Student[] sarr;
	   static int count;
	   static {
		   sarr=new Student[100];
		   sarr[0]=new Student(12,"Ashu",67,78,67,new Date());
		   sarr[1]=new Student(13,"Deepa",66,77,65,new Date());
		   count=2;
	   }
	

	   
	 //add new student at count position  
	public static boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter m1");
		float m1=sc.nextFloat();
		System.out.println("enter m2");
		float m2=sc.nextFloat();
		System.out.println("enter m3");
		float m3=sc.nextFloat();
		System.out.println("enter date (dd/MM/yyyy)");
		String dt=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date jdt=null;
		try {
			jdt=sdf.parse(dt);
		} catch (ParseException e) {
			System.out.println("pls enter date in proper format");
		}
		//check whether array is not full
		if(count<sarr.length) {
			sarr[count]=new Student(sid,nm,m1,m2,m3,jdt);
			count++;
			return true;
		}else {
			 System.out.println("array is full");
		      return false;
		}
      
	}

   //return a array
	public static Student[] displayAll() {
		return sarr;
	}

	public static Student findById(int id) {
		for(int i=0;i<count;i++) {
			if(sarr[i].getSid()==id) {
				return sarr[i];
			}
		}
		return null;
	}

	//search all students with given name
	public static Student[] findByName(String nm) {
		Student[] arr=new Student[count];
		int i=0;
		for(Student s:sarr) {
			if(s!=null) {
					  if(s.getSname().equals(nm)) {
						  arr[i]=s;
						  i++;
					  }
			}else {
				break;
			}
		}
		if(i>0) {
			return arr;
		}
		return null;
	}

	public static boolean updateById(int id, float nm1, float nm2, float nm3) {
		//search the student for updation
		Student s1=findById(id);
		//if found then update marks using setter methods
		if(s1!=null) {
			s1.setM1(nm1);
			s1.setM2(nm2);
			s1.setM3(nm3);
			return true;
		}
		//if not found
		return false;
	}

	//delete the object if found and if user says yes
	public static int deleteById(int id) {
		Scanner sc=new Scanner(System.in);
		//searching the object
		for(int i=0;i<count;i++) {
			if(sarr[i].getSid()==id) {
				//if found confirm from user
				System.out.println(sarr[i]);
				System.out.println("Do you want to delete it(y/n)");
				String ans=sc.next();
				if(ans.equals("y")) {
					//delete the object and shift all remaining one loaction to left
					for(int j=i;j<count;j++) {
						sarr[j]=sarr[j+1];
					}
					//assign lst object to null and reduce count by one
					count--;
					sarr[count]=null;
					count--;
					return 1;
				}else {
					return 2;
				}
				
			}
		}
		return 3;
	}

}
