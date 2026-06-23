package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDatainputStream1 {

	public static void main(String[] args) {
	    int id=1234;
	    String name="Rajan";
	    double sal=23456;
	    try(DataOutputStream dos=new DataOutputStream(new  FileOutputStream("testemp.txt"));
	    		DataInputStream dis=new DataInputStream(new FileInputStream("testemp.txt"))
	    		){
	    	    //write data to the file
	    	    dos.writeInt(id);
	    	    dos.writeUTF(name);
	    	    dos.writeDouble(sal);
	    	    //read data
	    	    int num=dis.readInt();
	    	    String nm=dis.readUTF();
	    	    double s=dis.readDouble();
	    	    System.out.println(num+"     "+nm+ "     "+s);
	    	    
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
