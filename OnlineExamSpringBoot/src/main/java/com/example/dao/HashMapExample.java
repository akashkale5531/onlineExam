package com.example.dao;

import java.util.Collection;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String>  hashmap =new HashMap<Integer, String>();
		hashmap.put(1,"java");
		hashmap.put(2,"by");
		hashmap.put(3,"kiran");
		
		Collection<String> collection = hashmap.values();
		
		System.out.println(collection.getClass().getName());
		
		for(String string : collection)
		{
			System.out.println(string + " " + string.length());
		}
		
	}
}
