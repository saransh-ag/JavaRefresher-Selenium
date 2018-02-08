package com.CollectionAPIs;

import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("cName", "Saransh Inc.");
		ht.put("Location", "Bangalore");
		ht.put("country", "India");
		
		System.out.println(ht.get("cName"));
		System.out.println(ht.get("Location"));
		System.out.println(ht.get("country"));
	}

}
