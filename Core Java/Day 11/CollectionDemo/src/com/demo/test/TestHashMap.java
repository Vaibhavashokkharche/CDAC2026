package com.demo.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Integer> htab=new Hashtable<>();
		
		htab.put("DAC", 240);
		//it does not allow null key
		//htab.put(null, null);   ///error
		
		Map<String,Integer> hm=new HashMap<>();
		hm.put(null, null);
		hm.put("DAC",240);
		hm.put("DTISS", 58);
		hm.put("DBDA", 60);
		System.out.println(hm);
		//check key exists, if not then add it
		if(!hm.containsKey("DAC")) {
			hm.put("DAC",400);
			System.out.println("data added");
		}else {
			System.out.println("key exists");
		}
		hm.put("DHPCSA",40);
		System.out.println(hm);
		System.out.println(hm.get("DAC"));
		
		//to retrive keys based on value
		//to display courses with capacity <100
		for(String s:hm.keySet()) {
			if(hm.get(s)<100) {
				System.out.println(s+"---->"+hm.get(s));
			}
		}
		
		        //to retrive keys based on value using entryset
				//to display courses with capacity <100
		Set<Map.Entry<String,Integer>> eset=hm.entrySet();
		for(Map.Entry<String,Integer> s:eset) {
			if(s.getValue()<100) {
				System.out.println(s.getKey()+"---->"+s.getValue());
			}
		}
		
		
		
	}

}
