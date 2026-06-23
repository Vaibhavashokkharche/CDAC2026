package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//open file for reading and writing
			 fis=new FileInputStream("testdata.txt");
		    fos=new FileOutputStream("testdatacopy.txt");
			//read data from file 
			int d=fis.read();
			while(d!=-1) {
				//write data to file
				fos.write(d);
				d=fis.read();
			}
			System.out.println("file copied");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
