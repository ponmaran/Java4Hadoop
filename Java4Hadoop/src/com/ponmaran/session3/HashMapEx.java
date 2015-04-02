package com.ponmaran.session3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hM = new HashMap<Integer, String>();
		hM.put(1, "Mathi");
		hM.put(2, "Venil");
		hM.put(3,null);
		hM.put(null, "empty");
		
		Iterator<Entry<Integer,String>> itr = hM.entrySet().iterator();

		while(itr.hasNext()){
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + ". " + hM.get(entry.getKey()));
		}
	}

}