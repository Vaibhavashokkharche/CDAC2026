package com.demo;

public class Person {
	static int count;
	static {
		count=0;
	}
   private String pid;
   private String pname;
   private String mob;
   private String generatePid(String nm,String m) {
	   count++;
	   return nm.substring(0, 3)+m.substring(0,3)+count;
   }
   public Person() {
	   
	   pid=generatePid("xxxxx","444444");
	   pname=null;
	   mob=null;
	   
   }
   public Person(String nm,String m) {
	   
	   pid=generatePid(nm,m);
	   pname=nm;
	   mob=m;
   }
   
   public void setPname(String nm) {
	   pname=nm;
	   
   }
   public void setMob(String m) {
	   mob=m;
	   
   }
   
   public String getPid() {
	   return pid;
   }
   public String getPname() {
	   return pname;
   }
   
   public String getMob() {
	   return mob;
   }
   
   public String toString() {
	   return pid+" , "+pname+" , "+mob;
   }
}
