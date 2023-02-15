package com.example.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* If content of 2 objects are equals , then their hashcode must be equal 
 * for this we need to override equals() and hashCode()
 * */
public class HashMapExample2 {

	public static void main(String[] args) {
		
	HashMap<Integer, String>  hashmap =new HashMap<Integer, String>();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		hashmap.put(i1,"java"); //  1 by
		hashmap.put(i2,"by");
		
		System.out.println(hashmap);
		
		Collection<String> collection = hashmap.values();
		
		System.out.println(collection.getClass().getName());
		
		for(String string : collection)
		{
			System.out.println(string + " " + string.length());
		}
		
	}
}
