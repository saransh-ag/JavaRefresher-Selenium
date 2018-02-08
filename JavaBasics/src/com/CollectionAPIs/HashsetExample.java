/**
 * HashSet -> Dynamic Memory Allocation happens
 * 
 */
package com.CollectionAPIs;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<String>();

		s.add("B");
		s.add("C");
		s.add("H");
		s.add("B");
		s.add("C");
		
		System.out.println("Size = " + s.size());
		//System.out.println(s.g);
		/*
		for (String x : s) {
			System.out.println(x);
		}
		*/
		
		Iterator<String> it = s.iterator();
		it.next();
		System.out.println(it.next());
		
	}

}
