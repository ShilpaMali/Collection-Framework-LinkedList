package com.velocity.linkedlist;

import java.util.LinkedList;

public class Demo4 {
	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();
		l.add("ram");
		l.add("shyam");
		l.add("ajay");
		
		// generics String, for each loop
		for (String str : l) {
			System.out.println(str);
		}
	}

}
