package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy1 {
	public static void main(String[] args) {
		File f=new File("testcopyfile.txt");
		FileOutputStream fos=null;
		 try {
						if(f.exists()) {
							 //open it in append mode
								fos=new FileOutputStream(f,true);	 
						}else {
							//open file in write mode
							  fos=new FileOutputStream(f);
						}
		 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }
		//using autoclosable block
		 try(FileInputStream fis=new FileInputStream("testdata.txt");
				 FileOutputStream fos1=fos;
				){
			 int i=fis.read();
			 while(i!=-1) {
				 fos.write(i);
				 i=fis.read();
			 }	 
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
