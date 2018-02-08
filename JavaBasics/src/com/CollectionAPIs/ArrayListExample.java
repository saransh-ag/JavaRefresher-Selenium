package com.CollectionAPIs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Object> ar = new ArrayList<Object>();
		
		ar.add("B");
		ar.add("C");
		ar.add("H");
		ar.add("B");
		ar.add("C");
		
		/* System.out.println(ar.get(2));
		System.out.println(ar.size());
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		*/
		for (Object x:ar) {
			System.out.println(x);
		}
	}

}
