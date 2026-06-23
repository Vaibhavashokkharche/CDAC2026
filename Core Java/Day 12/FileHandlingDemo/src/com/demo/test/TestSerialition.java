package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.demo.model.Vehicle;

public class TestSerialition {

	public static void main(String[] args) {
		Set<Vehicle> vset=new HashSet<>();
		vset.add(new Vehicle(11,"Activa",80000,"5G",LocalDate.of(2020, 11,11)));
		vset.add(new Vehicle(12,"I10",100000,"asta",LocalDate.of(2021, 11,11)));
		vset.add(new Vehicle(13,"Civic",1400000,"5G",LocalDate.of(2022, 11,11)));
	    String fname="testvehicle.txt"; 
	    //serialization of objects
		writeToFile(vset,fname);
		Set<Vehicle> vset1=new HashSet<>();
		//deserialization of objects
		readFromfile(vset1,fname);
		vset1.forEach(System.out::println);
	}

	private static void readFromfile(Set<Vehicle> vset1, String fname) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
		
			while(true) {
				Vehicle v= (Vehicle)ois.readObject();
				vset1.add(v);
			}
			
			
		} catch(EOFException e) {
			System.out.println("reched to end of file.............");
		}
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeToFile(Set<Vehicle> vset, String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname));){
			  for(Vehicle v:vset) {
				  //serialization of objects
				  oos.writeObject(v);
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
